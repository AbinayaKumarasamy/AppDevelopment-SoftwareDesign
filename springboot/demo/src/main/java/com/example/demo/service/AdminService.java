package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Create a new admin
    public Admin createAdmin(Admin admin) {
        // Save the admin with plain text password
        return adminRepository.save(admin);
    }

    // Retrieve an admin by ID
    public Optional<Admin> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    // Retrieve an admin by username
    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    // Retrieve all admins
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Update an admin
    public Admin updateAdmin(Long id, Admin adminDetails) {
        Optional<Admin> optionalAdmin = adminRepository.findById(id);
        if (optionalAdmin.isPresent()) {
            Admin admin = optionalAdmin.get();
            admin.setUsername(adminDetails.getUsername());
            admin.setPassword(adminDetails.getPassword()); // Update with plain text password
            return adminRepository.save(admin);
        } else {
            throw new RuntimeException("Admin not found with id " + id);
        }
    }

    // Delete an admin
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
