package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FAQ;
import com.example.demo.service.FAQService;

@RestController
@RequestMapping("api/faqs")
public class FAQController {

    @Autowired
    private FAQService faqService;
    @CrossOrigin(origins="http://localhost:5173")
    @GetMapping
    public List<FAQ> getAllFAQs() {
        return faqService.getAllFAQs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FAQ> getFAQById(@PathVariable String id) {
        Optional<FAQ> faq = faqService.getFAQById(id);
        return faq.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public FAQ createFAQ(@RequestBody FAQ faq) {
        return faqService.saveFAQ(faq);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<FAQ> updateFAQ(@PathVariable String id, @RequestBody FAQ faq) {
    //     if (faqService.getFAQById(id).isPresent()) {
    //         faq.setId(id);
    //         return ResponseEntity.ok(faqService.saveFAQ(faq));
    //     }
    //     return ResponseEntity.notFound().build();
    // }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFAQ(@PathVariable String id) {
        if (faqService.getFAQById(id).isPresent()) {
            faqService.deleteFAQ(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
