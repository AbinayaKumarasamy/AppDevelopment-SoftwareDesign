package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.InsuranceService;
import com.example.demo.repository.InsuranceServiceRepository;

@Service
public class InsuranceServiceS {

    @Autowired
    private InsuranceServiceRepository repository;

    // Get all services
    public List<InsuranceService> getAllServices() {
        return repository.findAll();
    }

    // Get a service by ID
    public Optional<InsuranceService> getServiceById(Long id) {
        return repository.findById(id);
    }

    // Create a new service
    public InsuranceService createService(InsuranceService service) {
        return repository.save(service);
    }

    // Update an existing service
    public InsuranceService updateService(Long id, InsuranceService updatedService) {
        if (repository.existsById(id)) {
            updatedService.setId(id);
            return repository.save(updatedService);
        }
        return null;
    }

    // Delete a service by ID
    public void deleteService(Long id) {
        repository.deleteById(id);
    }
}
