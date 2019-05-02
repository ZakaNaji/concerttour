package concerttours.facades.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Required;



import concerttours.data.BandData;
import concerttours.data.TourSummaryData;
import concerttours.enums.MusicType;
import concerttours.facades.BandFacade;
import concerttours.model.BandModel;
import concerttours.service.BandService;

public class DefaultBandFacade implements BandFacade {

    private BandService bandService;
    private Converter<BandModel,BandData> bandConverter;

    @Override
    public List<BandData> getBands() {
        final List<BandModel> bandModels = bandService.getBands();
        final List<BandData> bandFacadeData = new ArrayList<>();
        for (final BandModel sm : bandModels)
        {
            bandFacadeData.add(bandConverter.convert(sm));
        }
        return bandFacadeData;
    }

    @Override
    public BandData getBand(String name) {

        if (name == null)
        {
            throw new IllegalArgumentException("Band name cannot be null");
        }
        final BandModel band = bandService.getBandForCode(name);
        if (band == null)
        {
            return null;
        }
        // Create a list of genres
        final List<String> genres = new ArrayList<>();
        if (band.getTypes() != null)
        {
            for (final MusicType musicType : band.getTypes())
            {
                genres.add(musicType.getCode());
            }
        }// Create a list of TourSummaryData from the matches
        final List<TourSummaryData> tourHistory = new ArrayList<>();
        if (band.getTours() != null)
        {
            for (final ProductModel tour : band.getTours())
            {
                final TourSummaryData summary = new TourSummaryData();
                summary.setId(tour.getCode());
                summary.setTourName(tour.getName(Locale.ENGLISH));
                // making the big assumption that all variants are concerts and ignore product catalogs
                summary.setNumberOfConcerts(Integer.toString(tour.getVariants().size()));
                tourHistory.add(summary);
            }
        }
        // Now we can create the BandData transfer object
        final BandData bandData = new BandData();
        bandData.setId(band.getCode());
        bandData.setName(band.getName());
        bandData.setAlbumsSold(band.getAlbumSales());
        bandData.setDescription(band.getHistory());
        bandData.setGenres(genres);
        bandData.setTours(tourHistory);
        return bandData;
    }

    @Required
    public void setBandConverter(Converter<BandModel, BandData> bandConverter) {
        this.bandConverter = bandConverter;
    }

    @Required
    public void setBandService(BandService bandService) {
        this.bandService = bandService;
    }
}
