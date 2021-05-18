package com.segieda.customer.service;

import com.segieda.credit.model.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAllCustomers();

    void createCustomer(CustomerDto customerDto);
}

