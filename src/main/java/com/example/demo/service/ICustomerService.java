package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Customer;

public interface ICustomerService {
    
    Iterable<Customer> findAllCustomer();

    Optional<Customer> findCustomer(Long id);

    void saveCustomer(Customer customer);
}
