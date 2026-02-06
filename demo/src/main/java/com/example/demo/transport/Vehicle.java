package com.example.demo.transport;

import com.example.demo.transport.enums.DispatchStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.time.LocalDateTime;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    @JoinColumn(name = "transport_id", nullable = false)
    private Long transportId;

    @Column(nullable = false)
    private String vehicleNumber; // 차량 번호

    @Column(nullable = false)
    private String vehicleType; // 차량 종류

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DispatchStatus dispatchStatus;

    @Column(nullable = false)
    private String driverName; // 기사 이름

    @Column(nullable = false)
    private String driverPhone; // 기사 번호

    @Column(nullable = false)
    private Double maxLoad; // 최대 적재량

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}