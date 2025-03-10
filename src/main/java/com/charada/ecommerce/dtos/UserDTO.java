package com.charada.ecommerce.dtos;

import com.charada.ecommerce.entities.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {
    private Long id;

    private String name;
    private String email;
    private String password;
    private String phone;
    private LocalDate birthDate;
    private String roles;
}

