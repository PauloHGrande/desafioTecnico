package com.ms.order.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.ms.order.dtos.OrderRecordDto;
import com.ms.order.model.Order;
import com.ms.order.service.OrderService;

@Component
public class OrderConsumer {
	
	@Autowired
	private OrderService orderService;

	@RabbitListener(queues = "${broker.queue.payment.name}")
	public void listenPaymentQueue(@Payload OrderRecordDto orderRecordDto) {
		var order = new Order();
		BeanUtils.copyProperties(orderRecordDto, order);
		orderService.atualizaStatus(order);
		//System.out.println(orderRecordDto);
	}
}
