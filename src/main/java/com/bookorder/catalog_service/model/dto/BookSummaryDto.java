package com.bookorder.catalog_service.model.dto;

import lombok.Data;

/**
 * A lightweight Data Transfer Object representing a summary of a book.
 * This is typically used in lists or within other DTOs (like AuthorDetailsDto)
 * to avoid circular dependencies and keep the data payload small.
 */
@Data
public class BookSummaryDto {

    private String isbn;
    private String title;
    private String coverImageUrl;
}
