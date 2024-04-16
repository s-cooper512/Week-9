package org.example.schoolapp.Controller;

import org.example.schoolapp.Course.Course;
import org.example.schoolapp.Course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private static CourseRepository courseRepository;

    //@GetMapping("/courses/{id}/name")
    public static String getCourseNameById(Long id) {
        // Retrieve the course by ID
        Optional<Course> courseOptional = courseRepository.findById(id);

//        // Check if the course exists
//        if (courseOptional.isEmpty ()) {
//            return ResponseEntity.notFound().build();
//        }

        // Retrieve the course entity
        Course course = courseOptional.get();

        // Return the course name
        return course.getName();
    }
}
