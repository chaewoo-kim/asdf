package com.example.demo.orders;

import com.example.demo.enumschaewoo.FranchiseOrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class FranchiseOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long franchise_order_id;

    @Column(nullable = false)
    private Long franchise_id;

    @Column(nullable = false)
    private String order_number;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String requirement;

    @Column(nullable = false)
    private LocalDate ordered_at;

    @Column(nullable = false)
    private FranchiseOrderStatus order_status;

    @Column(nullable = false)
    private Integer total_quantity;

    @Column(nullable = false)
    private BigDecimal total_amount;

    @Column(nullable = false)
    private LocalDate delivery_date;

    @Column(nullable = false)
    private LocalDate createdAt;

    private LocalDate deletedAt;

    @Column(nullable = false)
    private LocalDate updatedAt;
}
