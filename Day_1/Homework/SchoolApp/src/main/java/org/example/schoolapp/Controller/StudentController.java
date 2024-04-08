package org.example.schoolapp.Controller;

import org.example.schoolapp.Student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> test = new ArrayList<>();
        test.add(new Student("Jeff"));
        test.add(new Student("Jane"));
        return test;
    }

    @GetMapping("/student")
    public Student getOneStudent() {
        Student test = new Student("Stephen");
        return test;
    }
}
