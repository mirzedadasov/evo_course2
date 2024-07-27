package com.person.mapper;

import com.person.dto.CreateTeacherDto;
import com.person.dto.UpdateTeacherDto;
import com.person.entity.TeacherEntity;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface TeacherMapper {
    TeacherEntity toTeacherDto(TeacherEntity saveTeacher);


    TeacherEntity toTeacherEntity(CreateTeacherDto createTeacherDto);

    TeacherEntity toTeacherEntity(UpdateTeacherDto updateTeacherDto, @MappingTarget TeacherEntity entity);
}
