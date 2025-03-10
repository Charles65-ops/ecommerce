package com.charada.ecommerce.controller;

import com.charada.ecommerce.dtos.PaymentDTO;

import com.charada.ecommerce.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/paymetns")
public class PaymentController {

        @Autowired
        private PaymentService paymentService;

        @GetMapping(value = "/{id}")
        public ResponseEntity<PaymentDTO> getpaymentById(@PathVariable Long id) {
            PaymentDTO paymentDTO = paymentService.findById(id);
            return ResponseEntity.ok(paymentDTO);
        }

        @GetMapping
        public ResponseEntity<Iterable<PaymentDTO>> getAllpayments() {
            List<PaymentDTO> list = paymentService.findAll();
            return ResponseEntity.ok(list);
        }
        @PostMapping
        public ResponseEntity<PaymentDTO> createpayment(@RequestBody PaymentDTO paymentDTO) {
            PaymentDTO payment= paymentService.create(paymentDTO);
            return ResponseEntity.ok(payment);
        }
        @PutMapping("/{id}")
        public ResponseEntity<PaymentDTO> updatepayment(@PathVariable Long id, @RequestBody PaymentDTO paymentDTO) {
            PaymentDTO payment= paymentService.update(id, paymentDTO);
            return ResponseEntity.ok(payment);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletepayment(@PathVariable Long id) {
            PaymentService.delete(id);
            return ResponseEntity.ok().build();
        }
    }
