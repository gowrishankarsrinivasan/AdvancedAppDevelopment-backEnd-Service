package com.bec.gowrishankarbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bec.gowrishankarbackend.model.Enquiry;
import com.bec.gowrishankarbackend.service.EnquiryService;

@RestController
public class EnquiryController {
    private final EnquiryService service;

    EnquiryController(EnquiryService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/save/enquiry")
    public Enquiry saveEnquiry(@RequestBody Enquiry enquiry) {
        return service.savEnquiry(enquiry);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/enquiry/getAllEnquiry")
    private List<Enquiry> getEnquiryList() {
        return service.getEnquiryList();
    }

    @GetMapping
    private Enquiry getEnquiryById(@PathVariable("id") String id) {
        return service.getEnquiryById(id);
    }

}
