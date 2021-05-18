package com.segieda.customer.service;

import com.segieda.credit.model.CustomerDto;
import com.segieda.customer.model.Customer;
import com.segieda.customer.repo.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll().stream().map(customerMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public void createCustomer(CustomerDto customerDto) {
        Customer customer = customerMapper.mapToEntity(customerDto);
        customerRepository.save(customer);
    }
}
