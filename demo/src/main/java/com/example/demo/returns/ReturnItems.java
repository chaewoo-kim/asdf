package com.example.demo.returns;

import com.example.demo.enumschaewoo.ReturnItemStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ReturnItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long return_item_id;

    @Column(nullable = false)
    private Long return_id;

    @Column(nullable = false)
    private Long franchise_order_item_id;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal total_return_price;

    @Column(nullable = false)
    private Boolean isConfirmed;

    @Column(nullable = false)
    private ReturnItemStatus return_item_status;

    @Column(nullable = false)
    private LocalDate createdAt;

    private LocalDate deletedAt;

    @Column(nullable = false)
    private LocalDate updatedAt;
}
