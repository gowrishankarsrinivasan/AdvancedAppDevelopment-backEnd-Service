package com.bec.gowrishankarbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.bec.gowrishankarbackend.model.Payment;
import com.bec.gowrishankarbackend.service.PaymentService;

public class PayController {
    private final PaymentService service;

    public PayController(PaymentService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/payment")
    private Payment savPayment(Payment payment) {
        return service.savePayment(payment);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/AllPayments")
    private List<Payment> getAllPayments() {
        return service.getAllPayments();
    }
}
