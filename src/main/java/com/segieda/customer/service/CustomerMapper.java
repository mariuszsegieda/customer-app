package com.segieda.customer.service;

import com.segieda.credit.model.CustomerDto;
import com.segieda.customer.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "creditId", target = "creditId")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "pesel", target = "pesel")
    @Mapping(source = "surname", target = "surname")
    Customer mapToEntity(CustomerDto source);

    @Mapping(source = "creditId", target = "creditId")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "pesel", target = "pesel")
    @Mapping(source = "surname", target = "surname")
    CustomerDto mapToDto(Customer source);
}
