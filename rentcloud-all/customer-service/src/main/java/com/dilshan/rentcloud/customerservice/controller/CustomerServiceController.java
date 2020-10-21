package com.dilshan.rentcloud.customerservice.controller;

import com.dilshan.rentcloud.customerservice.service.CustomerService;
import com.dilshan.rentcloud.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author dilshanboteju
 */
@RestController
@RequestMapping("/services/customers")
public class CustomerServiceController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping(value = "/{id}")
    public Customer findById(@PathVariable int id){
        System.out.println("request came on "+ LocalDateTime.now() + "  3  ++++++++++++++++++++++");
        return customerService.findById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.findAll();
    }
}
