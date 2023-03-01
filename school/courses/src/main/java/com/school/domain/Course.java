package com.school.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
public class Course {
    @Id
    private String id;
    private String courseName;
    private String department;
}
