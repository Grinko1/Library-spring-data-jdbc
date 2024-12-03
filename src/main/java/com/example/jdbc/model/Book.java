package com.example.jdbc.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    @Id
    private Long id;
    @NotBlank(message = "title must be field")
    private String title;
    @NotBlank(message = "author must be field")
    private String author;
    @NotNull(message = "year of publication must be field")
    private Integer publicationYear;
}
