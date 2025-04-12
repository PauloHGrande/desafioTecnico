package com.ms.order.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.order.dtos.OrderRecordDto;
import com.ms.order.model.Order;
import com.ms.order.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping
    public ResponseEntity<Order> create(@RequestBody @Valid OrderRecordDto o) {
        var order = new Order();
        BeanUtils.copyProperties(o, order);        
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.save(order));
    }

    @GetMapping
    public List<Order> list() {
        return orderService.buscarTodos();
    }
}
