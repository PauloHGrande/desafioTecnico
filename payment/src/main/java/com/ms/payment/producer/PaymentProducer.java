package com.ms.payment.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ms.payment.dtos.PaymentRecordDto;

@Component
public class PaymentProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	//Exchange do tipo default: chave routing key e o mesmo nome
	@Value(value = "${broker.queue.payment.name}")
	private String routngKey;
	
	public void publishMessagePedido(PaymentRecordDto oder) {
		
		rabbitTemplate.convertAndSend("", routngKey, oder);
		
	}	
}
