package org.example.schoolapp.Controller;

import org.example.schoolapp.Student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Student> getAllCourses() {

        return null; //Figure out return statements
    }

    @GetMapping("/course")
    public Student getOneCourses() {
        return null; //Placeholder
    }
}
