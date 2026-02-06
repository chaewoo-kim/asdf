package com.example.demo.branch;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Franchise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    @Column(nullable = false)
    private String storeCode;

    @Column(nullable = false)
    private String storeName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String operationDays;

    @Column(nullable = false)
    private String operationHours;

    @Column(nullable = false)
    private Double area;

    @Column(nullable = false)
    private String storeImage;

    @Column(nullable = false)
    private int warningCount = 0;

    @Column(nullable = false)
    private boolean penaltyStatus = false;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
