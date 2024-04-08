package org.example.schoolapp.Controller;

import org.example.schoolapp.Teacher.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeacherController {
    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        List<Teacher> test = new ArrayList<>();
        test.add(new Teacher("Mrs. Doe"));
        test.add(new Teacher("Mr. Smith"));
        return test;
    }

    @GetMapping("/teacher")
    public Teacher getOneTeacher() {
        Teacher test = new Teacher("Mr. Cooper");
        return test;
    }
}
