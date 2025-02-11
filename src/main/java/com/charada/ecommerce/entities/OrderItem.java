package com.charada.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_order_item")
public class OrderItem {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private int quantity;
    private double price;


}
