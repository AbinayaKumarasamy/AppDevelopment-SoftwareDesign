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
    private PolicyRepository policyRepository;

    public Policy savePolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Optional<Policy> getPolicyById(Long id) {
        return policyRepository.findById(id);
    }

    public Optional<Policy> updatePolicy(Long id, Policy policyDetails) {
        return policyRepository.findById(id).map(policy -> {
            policy.setName(policyDetails.getName());
            policy.setEmail(policyDetails.getEmail());
            policy.setPhoneNumber(policyDetails.getPhoneNumber());
            policy.setAge(policyDetails.getAge());
            policy.setHealthConditions(policyDetails.getHealthConditions());
            policy.setGender(policyDetails.getGender());
            policy.setMaritalStatus(policyDetails.getMaritalStatus());
            policy.setNationality(policyDetails.getNationality());
            policy.setOccupation(policyDetails.getOccupation());
            policy.setEmployer(policyDetails.getEmployer());
            policy.setAnnualIncome(policyDetails.getAnnualIncome());
            policy.setAddress(policyDetails.getAddress());
            policy.setSsn(policyDetails.getSsn());
            policy.setDriverLicenseNumber(policyDetails.getDriverLicenseNumber());
            policy.setPassportNumber(policyDetails.getPassportNumber());
            policy.setInsuranceType(policyDetails.getInsuranceType());
            policy.setPolicyTerm(policyDetails.getPolicyTerm());
            policy.setCoverageAmount(policyDetails.getCoverageAmount());
            policy.setBeneficiaries(policyDetails.getBeneficiaries());
            policy.setHeight(policyDetails.getHeight());
            policy.setWeight(policyDetails.getWeight());
            policy.setSmokingStatus(policyDetails.isSmokingStatus());
            policy.setAlcoholConsumption(policyDetails.getAlcoholConsumption());
            policy.setMedicalHistory(policyDetails.getMedicalHistory());
            policy.setCurrentMedications(policyDetails.getCurrentMedications());
            policy.setPrimaryCarePhysician(policyDetails.getPrimaryCarePhysician());
            policy.setExistingPolicies(policyDetails.getExistingPolicies());
            policy.setOutstandingDebts(policyDetails.getOutstandingDebts());
            policy.setPaymentMethod(policyDetails.getPaymentMethod());
            policy.setBankAccountDetails(policyDetails.getBankAccountDetails());
            policy.setBillingAddress(policyDetails.getBillingAddress());
            policy.setAgentBrokerInfo(policyDetails.getAgentBrokerInfo());
            policy.setReferralInfo(policyDetails.getReferralInfo());
            return policyRepository.save(policy);
        });
    }

    public boolean deletePolicy(Long id) {
        Optional<Policy> policy = policyRepository.findById(id);
        if (policy.isPresent()) {
            policyRepository.delete(policy.get());
            return true;
        }
        return false;
    }
}
