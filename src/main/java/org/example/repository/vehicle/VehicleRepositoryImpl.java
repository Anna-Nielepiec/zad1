package org.example.repository.vehicle;

import org.example.domain.Vehicle;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VehicleRepositoryImpl implements CustomerVehicleRepo,SellerVehicleRepo{


    @Override
    public List<Vehicle> getVehicle(Vehicle vehicle) {

        Vehicle vehicle1 = new Vehicle("red", "A8","Audi", "SO11111", 1);
        Vehicle vehicle2 = new Vehicle("blue", "C4","Citroen", "SO22222", 2);
        Vehicle vehicle3 = new Vehicle("white", "Aygo","Toyota", "SO33333", 3);

        return Stream.of(vehicle1, vehicle2, vehicle3).collect(Collectors.toList());

    }

    @Override
    public Vehicle getVehicleById(Long vehicleId) {
        return getVehicle()
                .stream()
                .filter(vehicle -> vehicle.getId() == vehicleId )
                .findFirst()
                .get();
    }

    @Override
    public boolean deleteVehicle(Long vehicleId) {
        Vehicle vehicleToDelete = getVehicleById(vehicleId);
        return getVehicle().remove(vehicleToDelete);
    }

    @Override
    public boolean addVehicle(Vehicle vehicle) {
        List<Vehicle> VehicleTpl = getVehicle();
        return VehicleTpl.add(vehicle);
    }


}
