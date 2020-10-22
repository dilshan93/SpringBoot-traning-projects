package com.dilshan.rentcloud.rentservice.controller;

import com.dilshan.rentcloud.model.rent.Rent;
import com.dilshan.rentcloud.rentservice.model.Response;
import com.dilshan.rentcloud.rentservice.model.SimpleResponse;
import com.dilshan.rentcloud.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @author dilshanboteju
 */
@RestController
@RequestMapping("/services/rents")
public class RentController {

    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent){
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type) throws ExecutionException, InterruptedException {

        if (type==null){
            return new SimpleResponse(rentService.findById(id));
        }else {
            return rentService.findDetailResponse(id);
        }
    }

    @GetMapping
    public List<Rent> getAllRents(){

        return rentService.findAll();
    }

    @RequestMapping("/test")
    public Rent getDateTime(){
        Rent rent = new Rent();
        rent.setCustomerId(1);
        rent.setVehicleId(1);
        rent.setCurrentOdometer(1222);
        rent.setRentFrom(LocalDateTime.now());
        rent.setRentTill(LocalDateTime.of(2010,12,31,00,00,00));
        rent.setReturnLocation("Colombo");

        return rent;
    }
}
