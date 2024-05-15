package com.thecodealchemist.jpawithhibernate.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Audit {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private int code;
    @AttributeOverrides(
            {
                    @AttributeOverride(name = "city", column = @Column(name = "audit_city")),
                    @AttributeOverride(name = "state", column = @Column(name = "audit_state")),
                    @AttributeOverride(name = "country", column = @Column(name = "audit_country")),
                    @AttributeOverride(name = "address", column = @Column(name = "audit_address")),
            }
    )
    private Address address;
}
