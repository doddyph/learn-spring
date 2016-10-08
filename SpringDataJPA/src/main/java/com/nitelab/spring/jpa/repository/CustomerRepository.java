package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dph on 08/10/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String name);
}
