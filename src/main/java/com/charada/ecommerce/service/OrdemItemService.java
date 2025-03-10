package com.charada.ecommerce.service;

import com.charada.ecommerce.repository.OrdemItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdemItemService {

    @Autowired
    private OrdemItemRepository ordemItemRepository;



}
