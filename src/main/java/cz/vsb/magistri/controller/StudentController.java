package cz.vsb.magistri.controller;

import cz.vsb.magistri.dto.StudentDto;
import cz.vsb.magistri.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping({"/students", "/students/"})
    public List<StudentDto> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping({"/students/{id}", "/students/{id}/"})
    public StudentDto getStudent(@PathVariable Integer id) {
        return studentService.getStudent(id);
    }

    @PostMapping({"/students", "/students/"})
    public StudentDto addStudent(@RequestBody StudentDto studentDto) {
        return studentService.addStudent(studentDto);
    }

    @PutMapping({"/students/{id}", "/students/{id}/"})
    public StudentDto editStudent(@PathVariable Integer id, @RequestBody StudentDto studentDto) {
        return studentService.editStudent(id, studentDto);
    }


    @DeleteMapping({"/students/{id}", "/students/{id}/"})
    public StudentDto deleteStudent(@PathVariable Integer id) {
        return studentService.deleteStudent(id);
    }
}
