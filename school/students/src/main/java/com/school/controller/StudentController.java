package com.school.controller;
import com.school.domain.Student;
import com.school.dto.Response;
import com.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Student/data")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Response findStudentById(@PathVariable String id){
        return studentService.findStudentById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteStudentById(@PathVariable String id){
        studentService.deletebyId(id);
    }
}
