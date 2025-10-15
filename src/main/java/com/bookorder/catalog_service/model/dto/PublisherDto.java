package com.bookorder.catalog_service.model.dto;

import com.bookorder.catalog_service.model.entity.Book;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class PublisherDto {
    private Long id;
    private String name;
    private String hqLocation;

    private List<BookSummaryDto> books;
}
