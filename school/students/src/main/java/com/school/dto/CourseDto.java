package com.school.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class CourseDto {
    @Id
    private String id;
    private String courseName;
    private String department;
}
