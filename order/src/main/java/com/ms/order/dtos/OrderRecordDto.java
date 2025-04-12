package com.ms.order.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;

public record OrderRecordDto(UUID id,
							 @NotBlank String product,
							 Double price,
							 @NotBlank String status) {

}
