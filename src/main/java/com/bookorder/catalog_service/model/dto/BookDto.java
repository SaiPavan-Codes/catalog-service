package com.bookorder.catalog_service.model.dto;

import com.bookorder.catalog_service.model.enums.BookCategory;
import lombok.Data;
import java.time.LocalDate;
import java.util.Set;

@Data
public class BookDto {

        private String isbn;
        private String title;
        private String description;
        private LocalDate publishDate;
        private int pageCount;
        private BookCategory category;
        private String coverImageUrl;

        private Set<AuthorSummaryDto> authors;

        private PublisherSummaryDto publisher;

        private String formattedPrice;

        private String availabilityStatus;
    }
