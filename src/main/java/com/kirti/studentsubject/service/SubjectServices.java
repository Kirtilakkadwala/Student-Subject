package com.kirti.studentsubject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kirti.studentsubject.entity.SubjectEntity;
import com.kirti.studentsubject.repository.SubjectRepository;

@Service
public class SubjectServices {
	private final SubjectRepository subjectRepository;

    public SubjectServices(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<SubjectEntity> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
