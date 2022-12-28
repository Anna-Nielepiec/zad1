package org.example.repository.vehicle;

import org.example.domain.Vehicle;

import java.util.List;

public interface CustomerVehicleRepo {


    Vehicle getVehicleById(Long vehicleId);


    List<Vehicle> getVehicle(Vehicle vehicle);
}
