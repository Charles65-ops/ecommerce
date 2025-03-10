package com.charada.ecommerce.service;

import com.charada.ecommerce.dtos.PaymentDTO;
import com.charada.ecommerce.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;


    public static void delete(Long id) {
    }

    public PaymentDTO findById(Long id) {
        return null;
    }

    public List<PaymentDTO> findAll() {
        return List.of();
    }

    public PaymentDTO update(Long id, PaymentDTO paymentDTO) {
        return paymentDTO;
    }

    public PaymentDTO create(PaymentDTO paymentDTO) {
        return null;
    }
}
