package com.example.apifooddelivery.service;

import com.example.apifooddelivery.domain.Order;
import com.example.apifooddelivery.repository.OrderRepository;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository)
    {
        this.orderRepository = orderRepository;
    }
    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
