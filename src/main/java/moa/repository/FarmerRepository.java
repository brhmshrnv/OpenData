package moa.repository;

import moa.model.Farmer;

import java.util.List;

public interface FarmerRepository {

    Farmer saveFarmer(Farmer farmer);
    boolean saveBatchFarmers(List<Farmer> farmerList);
    Farmer updateFarmer(Farmer farmer);
    boolean removeFarmer(int id);
    Farmer findById(int id);
    List<Farmer> findFarmers();

}
