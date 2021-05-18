package com.segieda.customer.service;

import com.segieda.credit.model.CustomerDto;
import com.segieda.credit.model.CustomerDto.CustomerDtoBuilder;
import com.segieda.customer.model.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-18T11:58:19+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer mapToEntity(CustomerDto source) {
        if ( source == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCreditId( source.getCreditId() );
        customer.setFirstName( source.getFirstName() );
        customer.setPesel( source.getPesel() );
        customer.setSurname( source.getSurname() );

        return customer;
    }

    @Override
    public CustomerDto mapToDto(Customer source) {
        if ( source == null ) {
            return null;
        }

        CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.creditId( source.getCreditId() );
        customerDto.firstName( source.getFirstName() );
        customerDto.pesel( source.getPesel() );
        customerDto.surname( source.getSurname() );

        return customerDto.build();
    }
}
