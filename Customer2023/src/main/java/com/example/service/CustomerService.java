package com.example.service;

import com.example.model.Customer;
import com.example.repository.Customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {



@Autowired
private Customerrepository customerrepository;
    public Customer saveCustomer(Customer customer) {
        return customerrepository.save(customer);
    }
}
