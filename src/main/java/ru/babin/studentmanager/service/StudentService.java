package ru.babin.studentmanager.service;

import ru.babin.studentmanager.model.Student;

import java.util.Collection;

public interface StudentService {
    Collection<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
