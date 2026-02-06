package com.example.demo.settlement;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Adjustment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long voucherId; // No Join

    @Column(nullable = false)
    private String reason;

    @Column(nullable = false)
    private Long adjustedAmount;

    @Column(nullable = false)
    private Long createdBy;

    // Base Fields와 겹치지만 요구사항 필드도 유지
    @Column(nullable = false)
    private LocalDateTime adjustmentCreatedAt;

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
