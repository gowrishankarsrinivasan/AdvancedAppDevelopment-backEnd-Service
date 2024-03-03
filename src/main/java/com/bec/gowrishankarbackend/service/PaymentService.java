package com.bec.gowrishankarbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bec.gowrishankarbackend.model.Payment;
import com.bec.gowrishankarbackend.repository.paymentRepo;

@Service
public class PaymentService {
    private final paymentRepo repo;
    public PaymentService(paymentRepo repo){
        this.repo = repo;
    }
    public Payment savePayment(Payment payment){
        return repo.save(payment);
    }
    public List<Payment> getAllPayments(){
        return repo.findAll();
    }
}
