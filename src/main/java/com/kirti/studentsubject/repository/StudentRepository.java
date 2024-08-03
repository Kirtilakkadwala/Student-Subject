package com.kirti.studentsubject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirti.studentsubject.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>  {

}
