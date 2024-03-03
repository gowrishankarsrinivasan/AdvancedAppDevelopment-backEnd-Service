package com.bec.gowrishankarbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bec.gowrishankarbackend.model.Enquiry;
import com.bec.gowrishankarbackend.repository.EnquiryRepo;

@Service
public class EnquiryService {
    private final EnquiryRepo repo;

    EnquiryService(EnquiryRepo repo) {
        this.repo = repo;
    }

    public Enquiry savEnquiry(Enquiry enquiry) {
        return repo.save(enquiry);
    }

    public List<Enquiry> getEnquiryList() {
        return repo.findAll();
    }

    public Enquiry getEnquiryById(String id) {
        return repo.findById(id).get();
    }
}
