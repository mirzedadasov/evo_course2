package com.person.service.impl;


import com.person.dto.CreateStudentDto;
import com.person.dto.UpdateStudentDto;
import com.person.entity.StudentEntity;
import com.person.exception.StudentNotFoundException;
import com.person.mapper.StudentMapper;
import com.person.repository.StudentRepository;
import com.person.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService {
    private  final StudentRepository studentRepository;
    private  final StudentMapper studentMapper;

    @Override
    public StudentEntity createStudent(CreateStudentDto createStudentDto) {
        StudentEntity studentEntity = studentMapper.toStudentEntity(createStudentDto);
       StudentEntity saveStudent= studentRepository.save(studentEntity);


        return studentMapper.toStudentDto(saveStudent);
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return  studentRepository.findAll()
                .stream()
                .map(studentMapper::toStudentDto)
                .toList();
    }

    @Override
    public StudentEntity updateStudent(Long id, UpdateStudentDto updateStudentDto) {
        StudentEntity entity = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(
                        "student id =" + id + " not found"));

        StudentEntity studentEntity = studentMapper.toStudentEntity(updateStudentDto,entity);
        StudentEntity saveStudentDb = studentRepository.save(studentEntity);
        return studentMapper.toStudentDto(saveStudentDb);


    }




}
