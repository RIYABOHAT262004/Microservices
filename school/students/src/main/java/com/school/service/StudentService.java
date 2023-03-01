package com.school.service;
import com.school.domain.Student;
import com.school.dto.CourseDto;
import com.school.dto.Response;
import com.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;
    public Student saveStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public List<Student> findAll() {

        return studentRepository.findAll();
    }

    public Response findStudentById(String id) {
        Optional<Student> student = studentRepository.findById(id);

        if (student.isPresent()){
            ResponseEntity<CourseDto> responseEntity = restTemplate
                    .getForEntity("http://localhost:8081/Course/Student/getById/" + student.get().getCourseId(),
                            CourseDto.class);

            CourseDto courseDto = responseEntity.getBody();
            System.out.println(courseDto);

            Response response = new Response();
            response.setStudent(student.get());
            response.setCourseDto(courseDto);
            return response;
        }


        return null;
    }
    public void deletebyId(String id) {
        studentRepository.deleteById(id);
    }

}
