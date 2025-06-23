package com.example.DiscoverClientProducer.controller;

import com.example.DiscoverClientProducer.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
    @GetMapping("/show")
    public ResponseEntity<String> showMsg(){
        return ResponseEntity.ok("From Employee Service!!!");
    }

    @PostMapping("/addEmp")
    public ResponseEntity<String> addEmp(@RequestBody Employee employee) {
        return ResponseEntity.ok(employee.getId()+employee.getName());
    }

}

