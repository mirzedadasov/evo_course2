package com.person.service;


import com.person.dto.CreateStudentDto;
import com.person.dto.UpdateStudentDto;
import com.person.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity createStudent(CreateStudentDto createStudentDto);

    List<StudentEntity> getAllStudent();

    StudentEntity updateStudent(Long id, UpdateStudentDto updateStudentDto);
}
