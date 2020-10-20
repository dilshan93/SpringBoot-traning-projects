package com.dilshan.rentcloud.customerservice.repository;

import com.dilshan.rentcloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dilshanboteju
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
