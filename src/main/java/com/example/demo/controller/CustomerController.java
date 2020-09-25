package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.ICustomerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CustomerController {
    
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    ICustomerService customerService;


    @RequestMapping(path = "/customer")
    public String viewCustomer(Model model) {
        logger.info("accessing customer view" );

        Iterable<Customer> customerList = customerService.findAllCustomer();
        model.addAttribute("customerList", customerList);

        logger.info("found customer: {}", customerList );
        
        return "customer";
    }
    

}
