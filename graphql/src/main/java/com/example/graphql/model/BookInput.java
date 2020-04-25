package com.example.graphql.model;

import lombok.Data;

/**
 * @className: BootInput.java
 * @date 2020/4/25 17:22
 * @description:
 */

@Data
public class BookInput {

    private String title;

    private String isbn;

    private int pageCount;

    private long authorId;

}

