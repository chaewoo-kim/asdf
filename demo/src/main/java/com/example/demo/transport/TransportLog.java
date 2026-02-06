package com.example.demo.transport;

import com.example.demo.transport.enums.DeliveryStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class TransportLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transportLogId;

    @Column(nullable = false)
    private String orderCode; // 주문 코드

    @Column(nullable = false)
    private Long deliveryId; // 배송 ID

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus; // 배송 상태 (준비, 배송중, 완료 등)

    @Column(nullable = false)
    private LocalDateTime createdAt; // 생성 시간

    @Column(nullable = false)
    private Long trackingNumber; // 운송장 번호
}