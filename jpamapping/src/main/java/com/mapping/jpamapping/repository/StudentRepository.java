package com.mapping.jpamapping.repository;

import com.mapping.jpamapping.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
