package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FAQ;
import com.example.demo.repository.FAQRepository;

@Service
public class FAQService {

    @Autowired
    private FAQRepository faqRepository;

    public List<FAQ> getAllFAQs() {
        return faqRepository.findAll();
    }

    public Optional<FAQ> getFAQById(String id) {
        return faqRepository.findById(id);
    }

    public FAQ saveFAQ(FAQ faq) {
        return faqRepository.save(faq);
    }

    public void deleteFAQ(String id) {
        faqRepository.deleteById(id);
    }

}
