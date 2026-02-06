package com.example.demo.settlement;

import com.example.demo.enumschaewoo.SettlementPeriodType;
import com.example.demo.enumschaewoo.SettlementStatus;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Settlement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long franchiseId;

    @Column(nullable = false)
    private SettlementPeriodType periodType;

    @Column
    private LocalDate settlementDate;

    @Column
    private String settlementMonth;

    @Column(nullable = false)
    private Long totalSalesAmount;

    @Column(nullable = false)
    private Long orderAmount;

    @Column(nullable = false)
    private Long deliveryFee;

    @Column(nullable = false)
    private Long commissionFee;

    @Column(nullable = false)
    private Long refundAmount;

    @Column(nullable = false)
    private Long lossAmount;

    @Column(nullable = false)
    private Long adjustmentAmount;

    @Column(nullable = false)
    private Long finalSettlementAmount;


    @Column(nullable = false)
    private SettlementStatus status;

    @Column(nullable = false)
    private LocalDateTime calculatedAt;

    @Column
    private LocalDateTime confirmedAt;

    // --- Base Fields ---
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDate createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDate updatedAt;

    @Column
    private LocalDate deletedAt;
}
