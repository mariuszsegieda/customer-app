package com.segieda.customer.rest;

import com.segieda.credit.model.CustomerDto;
import com.segieda.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/customer")
@Slf4j
@RequiredArgsConstructor
public class CustomerRest {
    private final CustomerService customerService;

    @GetMapping(path = "/get", produces = {"application/json"})
    public List<CustomerDto> getCustomer() {
        return customerService.getAllCustomers();
    }

    @PostMapping(path = "/create", produces = {"application/json"})
    public void createCustomer(@RequestBody CustomerDto customer) {
        customerService.createCustomer(customer);
    }
}
