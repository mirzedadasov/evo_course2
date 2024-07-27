package com.person.service.impl;


import com.person.dto.CreateTeacherDto;
import com.person.dto.UpdateTeacherDto;
import com.person.entity.TeacherEntity;
import com.person.exception.StudentNotFoundException;
import com.person.mapper.TeacherMapper;
import com.person.repository.TeacherRepository;
import com.person.service.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeacherServiceImpl implements TeacherService {
private  final TeacherRepository teacherRepository;
private  final TeacherMapper teacherMapper;

    @Override
    public TeacherEntity createTeacher(CreateTeacherDto createTeacherDto) {
        TeacherEntity teacherEntity = teacherMapper.toTeacherEntity(createTeacherDto);
        TeacherEntity saveTeacher= teacherRepository.save(teacherEntity);


        return teacherMapper.toTeacherDto(saveTeacher);
    }

    @Override
    public List<TeacherEntity> getAllTeacher() {
        return  teacherRepository.findAll()
                .stream()
                .map(teacherMapper::toTeacherDto)
                .toList();
    }

    @Override
    public TeacherEntity updateTeacher(Long id, UpdateTeacherDto updateTeacherDto) {
        TeacherEntity entity = teacherRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(
                        "teacher id =" + id + " not found"));

        TeacherEntity teacherEntity = teacherMapper.toTeacherEntity(updateTeacherDto,entity);
        TeacherEntity saveTeacherDb = teacherRepository.save(teacherEntity);
        return teacherMapper.toTeacherDto(saveTeacherDb);
    }
}
