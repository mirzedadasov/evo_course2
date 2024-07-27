package com.person.controller;

import com.person.dto.*;
import com.person.entity.TeacherEntity;
import com.person.service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;


    @PostMapping
    public ResponseEntity<TeacherEntity> createTeacher(@Valid @RequestBody
                                                       CreateTeacherDto createTeacherDto) {
        return ResponseEntity.ok(teacherService.createTeacher(createTeacherDto));
    }

    @GetMapping
    public ResponseEntity<List<TeacherEntity>> getTeacher() {
        return ResponseEntity.ok(teacherService.getAllTeacher());
    }

    @PatchMapping
    public ResponseEntity<TeacherEntity> updateTeacher(@RequestParam Long id, @Valid @RequestBody UpdateTeacherDto updateTeacherDto) {
        return ResponseEntity.ok(teacherService.updateTeacher(id,updateTeacherDto));


}}
