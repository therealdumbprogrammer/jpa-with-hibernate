package com.thecodealchemist.jpawithhibernate.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String city;
    private String state;
    private String country;
    private String address;
}
