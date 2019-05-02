package concerttours.service;

import java.util.List;

import concerttours.model.BandModel;

public interface BandService {

    List<BandModel> getBands();
    BandModel getBandForCode(String code);
}
