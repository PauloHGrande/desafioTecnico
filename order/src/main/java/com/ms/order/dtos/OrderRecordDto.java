package com.ms.order.dtos;

import jakarta.validation.constraints.NotBlank;

public record OrderRecordDto(@NotBlank String product,
							 Double price,
							 @NotBlank String status) {

}
