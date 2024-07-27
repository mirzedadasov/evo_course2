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
public class UpdateStudentDto {
    @NotBlank(message = "name can not be null or empty")
    private String name;

    @NotBlank(message = "surname can not be null or empty")
    private String surname;

    @NotBlank(message = "address can not be null or empty")
    private String address;

    private Long phoneNumber;

}
