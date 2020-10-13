package com.dilshan.rentcloud.profileservice.service;

import com.dilshan.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    Customer findById(int id);
    List<Customer> getAll();
}
