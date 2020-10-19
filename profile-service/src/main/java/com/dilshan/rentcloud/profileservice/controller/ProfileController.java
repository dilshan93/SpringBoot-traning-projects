package com.dilshan.rentcloud.profileservice.controller;

import com.dilshan.rentcloud.commons.model.Customer;
import com.dilshan.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> findById(@PathVariable(value = "id") int customerId) {
        Customer customer = customerService.findById(customerId);
        if (customer == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(customer);
        }
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_admin')")
    public List<Customer> findAllProfiles() {
        return customerService.getAll();
    }
}
