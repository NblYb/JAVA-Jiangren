package com.Jiangren.demo.services;


import com.Jiangren.demo.dtos.Student;
import com.Jiangren.demo.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student createStudent(Student student) {
        com.Jiangren.demo.entity.Student studentEntity = new com.Jiangren.demo.entity.Student();
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setPassword("123123");

        com.Jiangren.demo.entity.Student returnedStudent = studentRepository.save(studentEntity);
        Student returnedDTO = new Student();
        returnedDTO.setFirstName(returnedStudent.getFirstName());

        return returnedDTO;
    }
}
