package com.ms.order.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, UUID>{

}
