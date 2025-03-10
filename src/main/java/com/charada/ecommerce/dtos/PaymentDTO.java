package com.charada.ecommerce.dtos;

import lombok.Data;

import java.time.Instant;

@Data
public class PaymentDTO {
    private Long id;
    private Instant moment;
}
