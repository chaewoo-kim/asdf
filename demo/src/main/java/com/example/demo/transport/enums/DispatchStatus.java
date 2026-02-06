package com.example.demo.transport.enums;

public enum DispatchStatus {
    AVAILABLE,    // 운송 가능 (준비 완료)
    UNAVAILABLE,  // 운송 불가 (수리, 휴무 등)
    DISPATCHED    // 운송 중 (이미 배차됨)
}
