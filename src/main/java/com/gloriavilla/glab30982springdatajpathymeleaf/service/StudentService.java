package com.gloriavilla.glab30982springdatajpathymeleaf.service;
import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.gloriavilla.glab30982springdatajpathymeleaf.dto.StudentDto;
import com.gloriavilla.glab30982springdatajpathymeleaf.model.Student;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



public interface StudentService {

    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();

}
