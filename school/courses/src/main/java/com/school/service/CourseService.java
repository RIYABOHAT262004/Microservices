package com.school.service;

import com.school.domain.Course;
import com.school.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Optional<Course> findCourseById(String id) {
        return courseRepository.findById(id);
    }

    public void deleteCourseById(String id) {
        courseRepository.deleteById(id);
    }
}
