package com.example.apifooddelivery.service;

import com.example.apifooddelivery.domain.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getAllOrders();
}
