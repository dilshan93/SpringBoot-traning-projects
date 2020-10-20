package com.dilshan.rentcloud.vehicleservice.controller;

import com.dilshan.rentcloud.model.vehicle.Vehicle;
import com.dilshan.rentcloud.vehicleservice.service.VehicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dilshanboteju
 */
@RestController
@RequestMapping("/services/vehicles")
public class VehicleController {

    @Autowired
    VehicalService vehicalService;

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle){
        return vehicalService.save(vehicle);
    }

    @GetMapping(value = "/{id}")
    public Vehicle findVehicle(@PathVariable int id){
        return vehicalService.findById(id);
    }

    @GetMapping
    public List<Vehicle> findAll(){
        return vehicalService.findAll();
    }
}
