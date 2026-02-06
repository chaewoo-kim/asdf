package com.example.demo.orders;

import com.example.demo.enumschaewoo.HeadOrderStatus;
import com.example.demo.enumschaewoo.OrderType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class HeadOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long head_order_id;

    @Column(nullable = false)
    private String order_number;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private LocalDate manufacture_date;

    @Column(nullable = false)
    private String requirement;

    @Column(nullable = false)
    private LocalDate ordered_at;

    @Column(nullable = false)
    private HeadOrderStatus order_status;

    @Column(nullable = false)
    private Integer total_quantity;

    @Column(nullable = false)
    private BigDecimal total_amount;

    @Column(nullable = false)
    private OrderType order_type;

    @Column(nullable = false)
    private LocalDate createdAt;

    private LocalDate deletedAt;

    @Column(nullable = false)
    private LocalDate updatedAt;
}
