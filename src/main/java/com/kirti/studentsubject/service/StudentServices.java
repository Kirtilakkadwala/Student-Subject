package com.kirti.studentsubject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kirti.studentsubject.entity.StudentEntity;
import com.kirti.studentsubject.repository.StudentRepository;

@Service 
public class StudentServices {
	 private final StudentRepository studentRepository;

	    public StudentServices(StudentRepository studentRepository) {
	        this.studentRepository = studentRepository;
	    }

	    public StudentEntity createStudent(StudentEntity student) {
	        return studentRepository.save(student);
	    }

	    public List<StudentEntity> getAllStudents() {
	        return studentRepository.findAll();
	    }
}
