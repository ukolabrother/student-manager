package ru.babin.studentmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.babin.studentmanager.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
