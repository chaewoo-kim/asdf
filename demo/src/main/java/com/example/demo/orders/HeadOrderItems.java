package com.example.demo.orders;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class HeadOrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long head_order_item_id;

    @Column(nullable = false)
    private Long head_order_id;

    @Column(nullable = false)
    private Long product_id;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal unit_price;

    @Column(nullable = false)
    private BigDecimal total_price;

    @Column(nullable = false)
    private LocalDate createdAt;

    private LocalDate deletedAt;

    @Column(nullable = false)
    private LocalDate updatedAt;
}
