package com.school.dto;

import com.school.domain.Student;
import lombok.Data;

@Data
public class Response {
    private Student student;
    private CourseDto courseDto;
}
