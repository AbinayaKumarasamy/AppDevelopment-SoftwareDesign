package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Policy;
import com.example.demo.repository.PolicyRepository;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository repository;

    public Policy savePolicy(Policy policy) {
        return repository.save(policy);
    }

    public List<Policy> getAllPolicies() {
        return repository.findAll();
    }

    public Optional<Policy> getPolicyById(Long id) {
        return repository.findById(id);
    }

    public Policy updatePolicy(Long id, Policy policyDetails) {
        Policy policy = repository.findById(id).orElseThrow(() -> new RuntimeException("Policy not found"));
        policy.setName(policyDetails.getName());
        policy.setEmail(policyDetails.getEmail());
        policy.setPhoneNumber(policyDetails.getPhoneNumber());
        policy.setAge(policyDetails.getAge());
        policy.setHealthConditions(policyDetails.getHealthConditions());
        return repository.save(policy);
    }
    public boolean deletePolicy(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }


}
