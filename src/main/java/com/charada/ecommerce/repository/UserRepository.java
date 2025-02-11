package com.charada.ecommerce.repository;

import com.charada.ecommerce.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}