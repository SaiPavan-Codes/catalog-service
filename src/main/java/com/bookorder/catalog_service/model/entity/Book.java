package com.bookorder.catalog_service.model.entity;

import com.bookorder.catalog_service.model.enums.BookCategory;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String isbn;
    private String title;
    private String description;
    private LocalDate publishDate;
    private int pageCount;

    @Enumerated(EnumType.STRING)
    private BookCategory category;

    private String coverImageUrl;
    private BigDecimal price;
    private int stockQuantity;
    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns        =    @JoinColumn(name = "book_id"),
            inverseJoinColumns =    @JoinColumn(name = "author_id")
    )
    private List<Author> author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}