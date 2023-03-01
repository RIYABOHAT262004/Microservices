package com.school.controller;
import com.school.domain.Course;
import com.school.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Course/Student")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/create")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @GetMapping("/getAll")
    public List<Course> getAllCourse(){
        return courseService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<Course> findCourseById(@PathVariable String id){
        return courseService.findCourseById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteCourseById(@PathVariable String id){
        courseService.deleteCourseById(id);
    }

}
