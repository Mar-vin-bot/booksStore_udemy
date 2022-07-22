package com.books_store.books_store.Dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.books_store.books_store.entity.Autor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Integer id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotBlank
    private Integer pages;

    @NotBlank
    private Integer chapters;

    @NotBlank
    @Size(max = 100)
    private String isbn;

    @NotBlank
    @Size(max = 200)
    private String publisherName;

    @Valid
    @NotBlank
    private Autor autor;
    
}
