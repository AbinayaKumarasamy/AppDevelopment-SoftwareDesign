// InsuranceServiceRepository.java
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.InsuranceService;

public interface InsuranceServiceRepository extends JpaRepository<InsuranceService, Long> {
}
