package com.kirti.studentsubject.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirti.studentsubject.entity.SubjectEntity;
import com.kirti.studentsubject.service.SubjectServices;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
	private final SubjectServices subjectService;

    public SubjectController(SubjectServices subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public ResponseEntity<List<SubjectEntity>> getAllSubjects() {
        return ResponseEntity.ok(subjectService.getAllSubjects());
    }
}
