package com.ms.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.payment.dtos.PaymentRecordDto;
import com.ms.payment.producer.PaymentProducer;

@Service
public class PaymentService {

	@Autowired
	private PaymentProducer paymentProducer;
	
	public PaymentRecordDto mensagem(PaymentRecordDto paymentRecordDto) {
		paymentProducer.publishMessagePedido(paymentRecordDto);
		return paymentRecordDto;
	}
}
