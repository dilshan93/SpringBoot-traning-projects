package com.dilshan.rentcloud.vehicleservice.service;

import com.dilshan.rentcloud.model.vehicle.Vehicle;

import java.util.List;

/**
 * @author dilshanboteju
 */
public interface VehicalService {
    Vehicle save(Vehicle vehicle);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}
