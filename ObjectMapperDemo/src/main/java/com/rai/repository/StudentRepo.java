package com.rai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
