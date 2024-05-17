package com.thecodealchemist.jpawithhibernate.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Long userId;
    private String name;
    private String email;

    @CreationTimestamp
    private LocalDateTime createDate;
    @UpdateTimestamp
    private LocalDateTime updatedTime;
    private Address address;
}
