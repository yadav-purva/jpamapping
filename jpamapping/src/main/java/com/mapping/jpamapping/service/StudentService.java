package com.mapping.jpamapping.service;

import com.mapping.jpamapping.entities.Address;
import com.mapping.jpamapping.entities.Student;
import com.mapping.jpamapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save student with addresses
    public Student saveStudent(Student student) {
        return studentRepository.save(student);  // Saves student and cascades to addresses
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }
}






/*@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }
}*/
