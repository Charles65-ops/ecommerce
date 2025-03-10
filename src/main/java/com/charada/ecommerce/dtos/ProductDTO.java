package com.charada.ecommerce.dtos;

import com.charada.ecommerce.entities.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
    private Long id;
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @NotBlank(message = "Name is resquired")
    private String name;
    @NotBlank(message = "price is required")
    @Positive(message = "price must be positive")
    private String description;
    private double price;
    @Size(min = 10, message = "Description must be beetwen 2 and 500 characters")
    @NotBlank(message = "Description is required")
    private String imgUrl;
    @NotEmpty(message = "Categories is required")
    private List<CategoryDTO> categories;




}
