package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.InsuranceService;
import com.example.demo.repository.InsuranceServiceRepository;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins="http://localhost:5173")  // Ensure the origin matches your React front-end
public class InsuranceServiceController {

    @Autowired
    private InsuranceServiceRepository repository;

    @GetMapping
    public List<InsuranceService> getAllServices() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsuranceService> getServiceById(@PathVariable Long id) {
        return repository.findById(id)
                .map(service -> ResponseEntity.ok(service))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<InsuranceService> createService(@RequestBody InsuranceService insuranceService) {
        InsuranceService savedService = repository.save(insuranceService);
        return new ResponseEntity<>(savedService, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InsuranceService> updateService(@PathVariable Long id, @RequestBody InsuranceService updatedService) {
        if (!repository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        updatedService.setId(id);
        InsuranceService savedService = repository.save(updatedService);
        return new ResponseEntity<>(savedService, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
