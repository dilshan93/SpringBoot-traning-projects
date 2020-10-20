package com.dilshan.rentcloud.vehicleservice.repository;

import com.dilshan.rentcloud.model.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dilshanboteju
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
