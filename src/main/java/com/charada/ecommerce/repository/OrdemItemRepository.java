package com.charada.ecommerce.repository;

import com.charada.ecommerce.entities.OrdemItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrdemItem, Long> {
}
