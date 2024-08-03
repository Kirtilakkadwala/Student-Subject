package com.kirti.studentsubject.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kirti.studentsubject.entity.StudentEntity;
import com.kirti.studentsubject.service.StudentServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	 private final StudentServices studentService;

	    public StudentController(StudentServices studentService) {
	        this.studentService = studentService;
	    }

	    @PostMapping
	    public ResponseEntity<StudentEntity> createStudent(@Valid @RequestBody StudentEntity student) {
	        return ResponseEntity.ok(studentService.createStudent(student));
	    }

	    @GetMapping
	    public ResponseEntity<List<StudentEntity>> getAllStudents() {
	        return ResponseEntity.ok(studentService.getAllStudents());
	        }
}
