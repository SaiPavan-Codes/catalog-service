package com.bookorder.catalog_service.model.dto;

import lombok.Data;

@Data
public class AuthorDto {
    private Long id;
    private String fullName;
    private String biography;
}


