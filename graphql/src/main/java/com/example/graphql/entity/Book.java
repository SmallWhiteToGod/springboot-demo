package com.example.graphql.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @className: Book.java
 * @date 2020/4/25 17:21
 * @description:
 */

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Book extends BaseEntity {
    @Column(columnDefinition = "varchar(50)")
    private String title;

    private String isbn;

    private int pageCount;

    private long authorId;
}
