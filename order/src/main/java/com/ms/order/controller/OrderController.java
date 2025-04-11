package com.ms.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.order.model.Order;
import com.ms.order.repositories.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	
	@PostMapping
    public Order create(@RequestBody Order o) {
        o.setStatus("CREATED");
        return orderRepository.save(o);
    }

    @GetMapping
    public List<Order> list() {
        return orderRepository.findAll();
    }
}
