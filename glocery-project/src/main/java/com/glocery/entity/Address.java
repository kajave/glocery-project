package com.glocery.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    private String address_line;
    private int zipCode;
    private String city;
    private  String state;
}
