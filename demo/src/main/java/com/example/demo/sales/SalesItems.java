package com.example.demo.sales;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class SalesItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sales_item_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_id", nullable = false)
    private Sales sales_id;

    @Column(nullable = false)
    private Long product_id;

    @Column(nullable = false)
    private String product_code;

    @Column(nullable = false)
    private String product_name;

    @Column(nullable = false)
    private String lot;

    @Column(nullable = false)
    private BigDecimal unit_price;

    @Column(nullable = false)
    private LocalDate createdAt;

    private LocalDate deletedAt;

    @Column(nullable = false)
    private LocalDate updatedAt;
}
