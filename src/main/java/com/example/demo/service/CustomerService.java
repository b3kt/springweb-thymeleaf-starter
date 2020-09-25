package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    private Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAllCustomer() {
        logger.info("finding all customer.");
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findCustomer(Long id) {
        logger.info("finding customer by id.");
        return customerRepository.findById(id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
        logger.info("customer saved. {} ", customer);
    }
    
}
