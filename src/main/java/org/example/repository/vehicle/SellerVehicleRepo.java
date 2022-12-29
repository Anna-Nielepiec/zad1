package org.example.repository.vehicle;

import org.example.domain.Vehicle;

import java.util.List;

public interface SellerVehicleRepo {


    boolean deleteVehicle(Long vehicle);


    boolean addVehicle(Vehicle vehicle);


    List<Vehicle> getVehicle(Vehicle vehicle);


    Vehicle getVehicleById(Long vehicleId);





}
