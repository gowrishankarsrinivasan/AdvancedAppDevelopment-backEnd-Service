package com.bec.gowrishankarbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bec.gowrishankarbackend.model.Payment;

public interface paymentRepo extends JpaRepository<Payment, String> {

}
