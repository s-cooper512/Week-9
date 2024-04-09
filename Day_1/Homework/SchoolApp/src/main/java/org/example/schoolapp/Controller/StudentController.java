package org.example.schoolapp.Controller;

import org.example.schoolapp.Data;
import org.example.schoolapp.Student.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return Data.allStudents;
    }

    @GetMapping("/student/{id}")
    public List<Student> getOneStudentByID(@PathVariable String id) {
        return (Data.allStudents.stream()
                .filter(student -> student.getStudentID().equals(id))
                .collect(Collectors.toList())
        );
    }

    @GetMapping("/students/name")
    public List<Student> getStudentsByName(@RequestParam("name") String name) {
        return (Data.allStudents.stream().filter(student -> student.getName().equals(name)).collect(Collectors.toList()));
    }

    @PostMapping("/student/add")
    public String addStudent(@RequestBody Student student) {
        Data.allStudents.add(student);

        return "Student added successfully!";
    }

    @PutMapping("/student/update/{ID}")
    public String updateStudent(@RequestBody Student student, @PathVariable String ID) {
        Data.allStudents.forEach(student1 -> {
            if (student1.getStudentID().equals(ID)) {
                student1.setName(student.getName());
                student1.setEnrolledCourses(student.getEnrolledCourses());
            }
        });

        return "Student updated successfully!";
    }

    @DeleteMapping("/student/delete/{ID}")
    public String deleteStudent(@PathVariable String ID) {
        Data.allStudents.removeIf(student -> student.getStudentID().equals(ID));

        return "Student successfully removed!";
    }
}
