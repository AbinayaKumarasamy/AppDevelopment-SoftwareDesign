package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ContactForm;
import com.example.demo.service.ContactFormService;

@RestController
@RequestMapping("/api/contact")
public class ContactFormController {

    @Autowired
    private ContactFormService contactFormService;
@CrossOrigin(origins="http://localhost:5173")
    @PostMapping
    public ResponseEntity<String> submitContactForm(@RequestBody ContactForm contactForm) {
        if (contactForm.getName() == null || contactForm.getEmail() == null || contactForm.getMessage() == null) {
            return new ResponseEntity<>("All fields are required.", HttpStatus.BAD_REQUEST);
        }

        contactFormService.saveContactForm(contactForm);
        return new ResponseEntity<>("Message received and saved!", HttpStatus.OK);
    }
}
