package com.segieda.customer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="customer")
public class Customer {
    @Id
    private Long creditId;
    @Column
    private String firstName;
    @Column
    private String pesel;
    @Column
    private String surname;
}
