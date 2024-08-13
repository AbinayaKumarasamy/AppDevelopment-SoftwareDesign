package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Data;
import com.example.demo.service.DataService;

@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private DataService dataService;
@CrossOrigin(origins="http://localhost:5173")
    @GetMapping("/data")
    public List<Data> getAllData() {
        return dataService.getAllData();
    }
}
