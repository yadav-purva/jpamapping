package com.mapping.jpamapping.Controller;

import com.mapping.jpamapping.entities.Address;
import com.mapping.jpamapping.entities.Student;
import com.mapping.jpamapping.service.AddressService;
import com.mapping.jpamapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private AddressService addressService;

    // Get all students
   @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    //save
    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }



}





















/*@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    // Create a new student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }


    // Get all students with their associated addresses
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}*/


