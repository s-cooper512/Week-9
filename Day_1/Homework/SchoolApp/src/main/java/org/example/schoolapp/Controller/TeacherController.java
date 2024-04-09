package org.example.schoolapp.Controller;

import org.example.schoolapp.Data;
import org.example.schoolapp.Teacher.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TeacherController {
    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {

        return Data.allTeachers;
    }

    @GetMapping("/teacher/{id}")
    public List<Teacher> getOneTeacherByID(@PathVariable String id) {

        return (Data.allTeachers.stream().filter(teacher -> teacher.getTeacherID().equals(id)).collect(Collectors.toList())
        );
    }

    @GetMapping("/teachers/name")
    public List<Teacher> getTeachersByName(@RequestParam("name") String name) {
        return (Data.allTeachers.stream().filter(teacher -> teacher.getName().equals(name)).collect(Collectors.toList()));
    }

    @PostMapping("/teacher/add")
    public String addTeacher(@RequestBody Teacher teacher) {
        Data.allTeachers.add(teacher);

        return "Teacher added successfully!";
    }

    @PutMapping("/teacher/update/{ID}")
    public String updateTeacher(@RequestBody Teacher teacher, @PathVariable String ID) {
        Data.allTeachers.forEach(teacher1 -> {
            if (teacher1.getTeacherID().equals(ID)) {
                teacher1.setName(teacher.getName());
                teacher1.setCourses(teacher.getCourses());
            }
        });

        return "Teacher updated successfully!";
    }

    @DeleteMapping("/teacher/delete/{ID}")
    public String deleteTeacher(@PathVariable String ID) {
        Data.allTeachers.removeIf(teacher -> teacher.getTeacherID().equals(ID));

        return "Teacher successfully removed!";
    }
}
