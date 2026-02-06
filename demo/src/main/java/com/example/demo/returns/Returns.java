package com.example.demo.returns;

import com.example.demo.enumschaewoo.ReturnStatus;
import com.example.demo.enumschaewoo.ReturnType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Returns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long return_id;

    @Column(nullable = false)
    private Long order_id;

    @Column(nullable = false)
    private String return_number;

    @Column(nullable = false)
    private ReturnType return_type;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer total_return_quantity;

    @Column(nullable = false)
    private BigDecimal total_return_amount;

    @Column(nullable = false)
    private ReturnStatus return_status;

    @Column(nullable = false)
    private LocalDate requested_at;

    @Column(nullable = false)
    private LocalDate createdAt;

    private LocalDate deletedAt;

    @Column(nullable = false)
    private LocalDate updatedAt;
};
