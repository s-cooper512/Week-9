package org.example.schoolapp.Controller;

import org.example.schoolapp.Course.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        List<Course> test = new ArrayList<>();
        test.add(new Course("Introduction to Alchemy"));
        test.add(new Course("Advanced Prestidigitation"));
        return test;
    }

    @GetMapping("/course")
    public Course getOneCourse() {
        Course test = new Course("Skelepathy 101");
        return test;
    }
}
