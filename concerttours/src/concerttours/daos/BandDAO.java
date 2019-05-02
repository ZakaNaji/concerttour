package concerttours.daos;

import java.util.List;

import concerttours.model.BandModel;

public interface BandDAO {

    List<BandModel> findBands();
    List<BandModel> findBandsByCode(String code);
}
