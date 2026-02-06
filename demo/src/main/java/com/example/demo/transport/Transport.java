package com.example.demo.transport;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Transport{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transportId;

    @Column(nullable = false)
    private String companyName; // 운송 업체명

    @Column(nullable = false)
    private String manager; // 담당자명

    @Column(nullable = false)
    private String officePhone; // 전화번호

    @Column(nullable = false)
    private String address; // 주소

    @Column(nullable = false)
    private Integer ownedVehicles; // 보유 차량 대수

    @ElementCollection // 간단한 String 리스트 저장할 때 써요!
    private List<String> serviceZones; // 주력 운송 지역

    @Column(nullable = false)
    private Integer unitPrice; // 운송 단가

    @Column(nullable = false)
    private LocalDate contractStartDate; // 계약 시작일

    @Column(nullable = false)
    private LocalDate contractEndDate; // 계약 종료일

    @Column(nullable = false)
    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
