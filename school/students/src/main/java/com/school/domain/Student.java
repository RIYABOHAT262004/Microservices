package com.school.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Student {
    @Id
    private String id;
    private String name;
    private int rollNo;
    private String email;
    private String contact;
    private String courseId;

}
