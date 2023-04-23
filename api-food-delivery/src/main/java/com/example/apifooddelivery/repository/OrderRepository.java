package com.example.apifooddelivery.repository;

import com.example.apifooddelivery.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
