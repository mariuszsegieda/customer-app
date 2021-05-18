package com.segieda.customer.service;

import com.segieda.credit.model.CustomerDto;
import com.segieda.customer.model.Customer;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;


class CustomerMapperTest {

    CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);

    @Test
    void mapToEntity() {
        // given
        CustomerDto customerDto = CustomerDto.builder()
                .creditId(1L)
                .firstName("firstName")
                .surname("surname")
                .pesel("pesel")
                .build();
        // when
        Customer customer = customerMapper.mapToEntity(customerDto);
        // then
        SoftAssertions.assertSoftly(s -> {
            s.assertThat(customer.getCreditId()).isEqualTo(customerDto.getCreditId());
        });
    }

    @Test
    void mapToDto() {
        // given
        Customer customer = new Customer();
        customer.setCreditId(1L);
        customer.setFirstName("firstName");
        customer.setPesel("pesel");
        customer.setSurname("surname");
        // when
        CustomerDto customerDto = customerMapper.mapToDto(customer);
        // then
        SoftAssertions.assertSoftly(s -> {
            s.assertThat(customerDto.getCreditId()).isEqualTo(customer.getCreditId());
            s.assertThat(customerDto.getFirstName()).isEqualTo(customer.getFirstName());
            s.assertThat(customerDto.getPesel()).isEqualTo(customer.getPesel());
            s.assertThat(customerDto.getSurname()).isEqualTo(customer.getSurname());
        });
    }
}