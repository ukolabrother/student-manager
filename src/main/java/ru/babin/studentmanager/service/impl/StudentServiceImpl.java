package ru.babin.studentmanager.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.babin.studentmanager.model.Student;
import ru.babin.studentmanager.repository.StudentRepository;
import ru.babin.studentmanager.service.StudentService;

import java.util.Collection;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
