package org.example.controller;

import org.example.domain.Vehicle;
import org.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController ("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getVehicle(){
        return vehicleService.getVehicle();
    }

    @GetMapping("/{vehicleId}")
    public Vehicle getVehicle(@PathVariable Long vehicleId){
        return vehicleService.getVehicleById(vehicleId);
    }

    @PostMapping
    public boolean postVehicle(@ModelAttribute Vehicle vehicle){
        return vehicleService.addVehicle(vehicle);
    }

    @DeleteMapping("/{vehicleId}")
    public boolean deleteVehicle(@PathVariable Long vehicleId){
        return vehicleService.deleteVehicle(vehicleId);
    }

    @PutMapping
    public boolean putBooks(){
        return true;
    }


    private java.util.List<Vehicle> toList(Vehicle... vehicles) {
        return java.util.List.of(vehicles);
    }

    private java.util.List<Vehicle> toList(Vehicle gr1, Vehicle gr2, Vehicle gr3) {
        java.util.List<Vehicle> vehicles = new ArrayList();
        vehicles.add(gr1);
        vehicles.add(gr2);
        vehicles.add(gr3);
        return vehicles;
    }







}
