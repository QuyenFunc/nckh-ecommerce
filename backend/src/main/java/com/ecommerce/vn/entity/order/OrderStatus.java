package com.ecommerce.vn.entity.order;

public enum OrderStatus {
    PENDING,       // Đơn hàng đang chờ xử lý
    APPROVED,      // Đơn hàng đã được phê duyệt
    SHIPPED,       // Đơn hàng đã được vận chuyển
    DELIVERED,     // Đơn hàng đã được giao
    CANCELED,      // Đơn hàng bị hủy bỏ
    RETURNED       // Đơn hàng đã được trả lại
}