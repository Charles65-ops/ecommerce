package com.charada.ecommerce.service;

import com.charada.ecommerce.dtos.CategoryDTO;
import com.charada.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public static void delete(Long id) {
    }

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        return categoryRepository.findAll().stream().map(category
                -> new CategoryDTO(category.getId(), category.getName())).toList();
    }

    public CategoryDTO findById(Long id) {
        return null;
    }

    public CategoryDTO update(Long id, CategoryDTO categoryDTO) {
        return null;
    }

    public CategoryDTO create(CategoryDTO categoryDTO) {
        return null;
    }
}