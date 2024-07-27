package com.person.service;


import com.person.dto.CreateTeacherDto;
import com.person.dto.UpdateTeacherDto;
import com.person.entity.TeacherEntity;

import java.util.List;

public interface TeacherService {

    TeacherEntity createTeacher(CreateTeacherDto createTeacherDto);

    List<TeacherEntity> getAllTeacher();

    TeacherEntity updateTeacher(Long id, UpdateTeacherDto updateTeacherDto);
}
