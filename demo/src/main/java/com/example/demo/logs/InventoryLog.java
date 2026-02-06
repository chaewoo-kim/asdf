package com.example.demo.logs;

import com.example.demo.enumsyunho.LocationType;
import com.example.demo.enumsyunho.LogType;
import com.example.demo.products.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "inventory_logs")
public class InventoryLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private String boxCode;
    private String orderCode;
    private String name;

    @Enumerated(EnumType.STRING)
    private LogType logType;

    private Integer supplyPrice;

    @Enumerated(EnumType.STRING)
    private LocationType locationType;

    private Long locationId;
    private Integer quantity;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
