package com.ms.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.order.model.Order;
import com.ms.order.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order save(Order o) {
		return orderRepository.save(o);
	}
	
	public List<Order> buscarTodos() {
		return orderRepository.findAll();
	}
}
