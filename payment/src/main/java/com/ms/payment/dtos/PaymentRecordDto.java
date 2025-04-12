package com.ms.payment.dtos;

import java.util.UUID;

public record PaymentRecordDto(UUID id,
							   String product,
							   Double price,
							   String status) {

}
