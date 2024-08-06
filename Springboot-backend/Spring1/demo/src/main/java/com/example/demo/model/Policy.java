package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String healthConditions;
    private String gender;
    private String maritalStatus;
    private String nationality;
    private String occupation;
    private String employer;
    private double annualIncome;
    private String address;
    private String ssn; // Social Security Number
    private String driverLicenseNumber;
    private String passportNumber;
    private String insuranceType;
    private int policyTerm;
    private double coverageAmount;
    private String beneficiaries;
    private double height;
    private double weight;
    private boolean smokingStatus;
    private String alcoholConsumption;
    private String medicalHistory;
    private String currentMedications;
    private String primaryCarePhysician;
    private String existingPolicies;
    private String outstandingDebts;
    private String paymentMethod;
    private String bankAccountDetails;
    private String billingAddress;
    private String agentBrokerInfo;
    private String referralInfo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("policies")
    private User user;

    @OneToMany(mappedBy = "policy", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("policy")
    private List<Payment> payments;

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealthConditions() {
        return healthConditions;
    }

    public void setHealthConditions(String healthConditions) {
        this.healthConditions = healthConditions;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public int getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public String getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(String beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(boolean smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public String getAlcoholConsumption() {
        return alcoholConsumption;
    }

    public void setAlcoholConsumption(String alcoholConsumption) {
        this.alcoholConsumption = alcoholConsumption;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getCurrentMedications() {
        return currentMedications;
    }

    public void setCurrentMedications(String currentMedications) {
        this.currentMedications = currentMedications;
    }

    public String getPrimaryCarePhysician() {
        return primaryCarePhysician;
    }

    public void setPrimaryCarePhysician(String primaryCarePhysician) {
        this.primaryCarePhysician = primaryCarePhysician;
    }

    public String getExistingPolicies() {
        return existingPolicies;
    }

    public void setExistingPolicies(String existingPolicies) {
        this.existingPolicies = existingPolicies;
    }

    public String getOutstandingDebts() {
        return outstandingDebts;
    }

    public void setOutstandingDebts(String outstandingDebts) {
        this.outstandingDebts = outstandingDebts;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getBankAccountDetails() {
        return bankAccountDetails;
    }

    public void setBankAccountDetails(String bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getAgentBrokerInfo() {
        return agentBrokerInfo;
    }

    public void setAgentBrokerInfo(String agentBrokerInfo) {
        this.agentBrokerInfo = agentBrokerInfo;
    }

    public String getReferralInfo() {
        return referralInfo;
    }

    public void setReferralInfo(String referralInfo) {
        this.referralInfo = referralInfo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    // Constructors
    public Policy() {
    }

    public Policy(Long id, String name, String email, String phoneNumber, int age, String healthConditions, String gender,
                  String maritalStatus, String nationality, String occupation, String employer, double annualIncome,
                  String address, String ssn, String driverLicenseNumber, String passportNumber, String insuranceType,
                  int policyTerm, double coverageAmount, String beneficiaries, double height, double weight,
                  boolean smokingStatus, String alcoholConsumption, String medicalHistory, 
                  String currentMedications, String primaryCarePhysician, 
                  String existingPolicies, String outstandingDebts, String paymentMethod, String bankAccountDetails,
                  String billingAddress, String agentBrokerInfo, String referralInfo, User user, List<Payment> payments) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.healthConditions = healthConditions;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
        this.occupation = occupation;
        this.employer = employer;
        this.annualIncome = annualIncome;
        this.address = address;
        this.ssn = ssn;
        this.driverLicenseNumber = driverLicenseNumber;
        this.passportNumber = passportNumber;
        this.insuranceType = insuranceType;
        this.policyTerm = policyTerm;
        this.coverageAmount = coverageAmount;
        this.beneficiaries = beneficiaries;
        this.height = height;
        this.weight = weight;
        this.smokingStatus = smokingStatus;
        this.alcoholConsumption = alcoholConsumption;
        this.medicalHistory = medicalHistory;
        this.currentMedications = currentMedications;
        this.primaryCarePhysician = primaryCarePhysician;
        this.existingPolicies = existingPolicies;
        this.outstandingDebts = outstandingDebts;
        this.paymentMethod = paymentMethod;
        this.bankAccountDetails = bankAccountDetails;
        this.billingAddress = billingAddress;
        this.agentBrokerInfo = agentBrokerInfo;
        this.referralInfo = referralInfo;
        this.user = user;
        this.payments = payments;
    }
}
