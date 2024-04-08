package org.example.schoolapp.Controller;

import org.example.schoolapp.Student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return null; //Figure out return statements
    }

    @GetMapping("/student")
    public Student getOneStudent() {
        return null; //Placeholder
    }
}
