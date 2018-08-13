package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    //private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
