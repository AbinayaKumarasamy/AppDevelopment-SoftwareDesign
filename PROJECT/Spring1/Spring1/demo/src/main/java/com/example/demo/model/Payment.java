package com.example.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private double interest;
    private Date paymentDate;
    private String paymentMethod;
    private String paymentStatus;
    private int age;

    @OneToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("payments")
    private Policy policy;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (age < 18) {
            this.amount = amount * 0.9; // 10% discount for under 18
        } else {
            this.amount = amount * 1.1; // 10% increase for 18 and over
        }
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        if (age < 18) {
            this.interest = interest * 0.9; // 10% discount for under 18
        } else {
            this.interest = interest * 1.1; // 10% increase for 18 and over
        }
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        // Update amount and interest whenever age is set
        setAmount(this.amount);
        setInterest(this.interest);
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    // Constructor
    public Payment() {
    }

    public Payment(Long id, double amount, double interest, Date paymentDate, String paymentMethod, String paymentStatus, int age, Policy policy) {
        this.id = id;
        this.amount = amount;
        this.interest = interest;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.age = age;
        this.policy = policy;
        // Ensure the amount and interest are set correctly based on age
        setAmount(amount);
        setInterest(interest);
    }
}
