package com.kirti.studentsubject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirti.studentsubject.entity.SubjectEntity;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long>{

}
