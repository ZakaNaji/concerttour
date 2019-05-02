package concerttours.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import concerttours.data.BandData;
import concerttours.model.BandModel;

public class BandPopulator implements Populator<BandModel, BandData> {

    @Override
    public void populate(BandModel bandModel, BandData bandData) throws ConversionException {
        bandData.setId(bandModel.getCode());
        bandData.setName(bandModel.getName());
        bandData.setDescription(bandModel.getHistory());
        bandData.setAlbumsSold(bandModel.getAlbumSales());
    }
}
