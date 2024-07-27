package com.person.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetStudentDto {
    private String name;
    private String surname;
    private String address;
    private Long phoneNumber;

}
