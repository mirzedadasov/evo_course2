package com.person.controller;

import com.person.dto.CreateStudentDto;
import com.person.dto.UpdateStudentDto;
import com.person.entity.StudentEntity;
import com.person.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentEntity> createStudent(@Valid @RequestBody
                                                       CreateStudentDto createStudentDto) {
        return ResponseEntity.ok(studentService.createStudent(createStudentDto));
    }

    @GetMapping
    public ResponseEntity<List<StudentEntity>> getStudent() {
        return ResponseEntity.ok(studentService.getAllStudent());//burda Student Entity yerine GetStudentDto nece edim
    }

    @PatchMapping
    public ResponseEntity<StudentEntity> updateStudent(@RequestParam Long id, @Valid @RequestBody UpdateStudentDto updateStudentDto) {
    return ResponseEntity.ok(studentService.updateStudent(id,updateStudentDto));

    }

}
