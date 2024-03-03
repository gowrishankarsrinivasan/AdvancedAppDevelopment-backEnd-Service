package com.bec.gowrishankarbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bec.gowrishankarbackend.model.Enquiry;

public interface EnquiryRepo extends JpaRepository<Enquiry,String>{
    
}
