package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// this interface contains all the methods we would want to use in the service class
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
//    this query annotation is optional but more explicit than using the equivalent method below
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
