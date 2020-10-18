package moa.service.impl;

import moa.model.Farmer;
import moa.repository.FarmerRepository;
import moa.repository.impl.FarmerRepositoryImpl;
import moa.service.FarmerService;

import java.util.List;

public class FarmerServiceImpl implements FarmerService {

    private FarmerRepository repository = new FarmerRepositoryImpl();

    @Override
    public Farmer saveFarmer(Farmer farmer) {
        return repository.saveFarmer(farmer);
    }

    @Override
    public boolean saveBatchFarmers(List<Farmer> farmerList) {
        return repository.saveBatchFarmers(farmerList);
    }

    @Override
    public Farmer updateFarmer(Farmer farmer) {
        return repository.updateFarmer(farmer);
    }

    @Override
    public boolean removeFarmer(int id) {
        return repository.removeFarmer(id);
    }

    @Override
    public Farmer findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Farmer> findFarmers() {
        return repository.findFarmers();
    }
}
