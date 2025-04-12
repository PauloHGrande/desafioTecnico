package com.ms.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.payment.dtos.PaymentRecordDto;
import com.ms.payment.service.PaymentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@PostMapping
    public ResponseEntity<PaymentRecordDto> confPagamento(@RequestBody @Valid PaymentRecordDto paymentRecordDto) {       
		paymentService.mensagem(paymentRecordDto);
		return ResponseEntity.status(HttpStatus.OK).body(paymentRecordDto);
    }
}
