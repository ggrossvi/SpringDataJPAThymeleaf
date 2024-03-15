package com.gloriavilla.glab30982springdatajpathymeleaf.repository;
import com.gloriavilla.glab30982springdatajpathymeleaf.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByEmail(String email);
}
