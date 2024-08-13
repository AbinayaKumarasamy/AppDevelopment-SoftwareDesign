package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FAQ;

@Repository
public interface FAQRepository extends JpaRepository<FAQ, String> {
}
