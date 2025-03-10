package com.charada.ecommerce.dtos;

import com.charada.ecommerce.entities.OrderStatus;
import lombok.Data;

import java.time.Instant;

@Data
public class OrderDTO {
    private Long id;
    private Instant moment;
    private OrderStatus status;
}
