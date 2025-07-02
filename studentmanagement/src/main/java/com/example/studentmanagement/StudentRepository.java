package com.example.studentmanagement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Spring Boot will auto-generate all CRUD operations
}
