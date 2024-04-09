package org.example.schoolapp.Controller;

import org.example.schoolapp.Course.Course;
import org.example.schoolapp.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses() {

        return Data.allCourses;
    }

    @GetMapping("/course/{id}")
    public List<Course> getOneCourseByID(@PathVariable String id) {
        return (Data.allCourses.stream().filter(course -> course.getCourseID().equals(id)).collect(Collectors.toList())
        );
    }

    @GetMapping("/courses/name")
    public List<Course> getCoursesByName(@RequestParam("name") String name) {
        return (Data.allCourses.stream().filter(course -> course.getCourseName().equals(name)).collect(Collectors.toList()));
    }

    @PostMapping("/course/add")
    public String addCourse(@RequestBody Course course) {
        Data.allCourses.add(course);

        return "Course added successfully!";
    }

    @PutMapping("/course/update/{ID}")
    public String updateCourse(@RequestBody Course course, @PathVariable String ID) {
        Data.allCourses.forEach(course1 -> {
            if (course1.getCourseID().equals(ID)) {
                course1.setCourseName(course.getCourseName());
                course1.setTeacherID(course.getTeacherID());
            }
        });

        return "Course updated successfully!";
    }

    @DeleteMapping("/course/delete/{ID}")
    public String deleteCourse(@PathVariable String ID) {
        Data.allCourses.removeIf(course -> course.getCourseID().equals(ID));

        return "Course successfully removed!";
    }
}
