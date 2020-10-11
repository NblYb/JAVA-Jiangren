package com.Jiangren.demo.controller;

import com.Jiangren.demo.dtos.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class DemoController {
    @PostMapping
    public ResponseEntity<Student> hello(){
        Student student = new Student();
        student.setFirstName("John");
        student.setSecondName("Gao");
        return ResponseEntity.ok(student);
    }
}
