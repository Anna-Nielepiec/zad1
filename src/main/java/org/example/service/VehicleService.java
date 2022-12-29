package org.example.service;


import org.example.domain.Vehicle;
import org.example.repository.vehicle.SellerVehicleRepo;
import org.example.repository.vehicle.VehicleRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private SellerVehicleRepo VehicleRepository;


   public List<Vehicle> getVehicle() {
       return VehicleRepository.getVehicle();
    }

    public Vehicle getVehicleById(Long vehicleId){
//       return VehicleRepository.getVehicleById(vehicleId);
        return getVehicle()
                .stream()
                .filter(vehicle -> vehicle.getId() == vehicleId )
                .findFirst()
                .get();
    }

    public boolean deleteVehicle(Long vehicleId){
       Vehicle vehicleToDelete = getVehicleById(vehicleId);
       return VehicleRepository.getVehicle().remove(vehicleToDelete);
    }

    public boolean addVehicle(Vehicle vehicle){
       return VehicleRepository.getVehicle().add(vehicle);
    }


}
