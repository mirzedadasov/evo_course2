package com.person.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherDto {
    private Long id;
    private String name;
    private String surname;
    private Long lessonCount;
    private Long phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String address;
}
