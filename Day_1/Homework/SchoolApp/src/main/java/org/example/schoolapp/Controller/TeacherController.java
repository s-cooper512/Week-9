package org.example.schoolapp.Controller;

import org.example.schoolapp.Student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {
    @GetMapping("/teachers")
    public List<Student> getAllTeachers() {

        return null; //Figure out return statements
    }

    @GetMapping("/teacher")
    public Student getOneTeacher() {
        return null; //Placeholder
    }
}
