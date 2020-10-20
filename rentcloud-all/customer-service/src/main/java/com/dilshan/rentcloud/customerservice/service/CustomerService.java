package com.dilshan.rentcloud.customerservice.service;

import com.dilshan.rentcloud.model.customer.Customer;

import java.util.List;

/**
 * @author dilshanboteju
 */
public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
