package com.person.mapper;

import com.person.dto.CreateStudentDto;
import com.person.dto.GetStudentDto;
import com.person.dto.UpdateStudentDto;
import com.person.entity.StudentEntity;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface StudentMapper {
    StudentEntity toStudentEntity(CreateStudentDto createStudentDto);
    GetStudentDto getStudentDto(StudentEntity studentEntity);

    StudentEntity toStudentDto(StudentEntity saveStudent);

    StudentEntity toStudentEntity(UpdateStudentDto updateStudentDto,@MappingTarget StudentEntity entity);
}
