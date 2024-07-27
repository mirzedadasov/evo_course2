package com.person.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTeacherDto {
    private String name;
    private String surname;
    private Long lessonCount;
    private String address;
    private Long phoneNumber;

}
