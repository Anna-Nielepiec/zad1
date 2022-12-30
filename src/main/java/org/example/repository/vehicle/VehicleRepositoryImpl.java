package org.example.repository.vehicle;

import org.example.domain.Vehicle;

import java.util.List;

public class VehicleRepositoryImpl implements CustomerVehicleRepo,SellerVehicleRepo{


    @Override
    public Vehicle getVehicleById(Long vehicleId) {
        return getVehicle()
                .stream()
                .filter()
                .findFirst(vehicle -> vehicle.getId() == vehicleId )
                .get();
    }

    @Override
    public boolean deleteVehicle(Long vehicle) {
        return false;
    }

    @Override
    public boolean addVehicle(Long vehicle) {
        return false;
    }

    @Override
    public List<Vehicle> getVehicle(Vehicle vehicle) {
        return null;
    }
}
