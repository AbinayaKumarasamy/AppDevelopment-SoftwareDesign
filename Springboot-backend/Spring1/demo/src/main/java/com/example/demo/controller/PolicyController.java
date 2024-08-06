package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    @Autowired
    private PolicyService service;

    @PostMapping
    public ResponseEntity<Policy> createPolicy(@RequestBody Policy policy) {
        Policy savedPolicy = service.savePolicy(policy);
        return ResponseEntity.ok(savedPolicy);
    }

    @GetMapping
    public ResponseEntity<List<Policy>> getAllPolicies() {
        List<Policy> policies = service.getAllPolicies();
        return ResponseEntity.ok(policies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPolicyById(@PathVariable("id") Long id) {
        Optional<Policy> policy = service.getPolicyById(id);
        if (policy.isPresent()) {
            return ResponseEntity.ok(policy.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePolicy(@PathVariable("id") Long id, @RequestBody Policy policy) {
        Optional<Policy> updatedPolicy = service.updatePolicy(id, policy);
        if (updatedPolicy.isPresent()) {
            return ResponseEntity.ok(updatedPolicy.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Policy not found");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePolicy(@PathVariable("id") Long id) {
        boolean isDeleted = service.deletePolicy(id);
        if (isDeleted) {
            return ResponseEntity.ok("Policy deleted successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Policy not found");
    }
}
