package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.entity.Author;
import com.example.graphql.entity.Book;
import com.example.graphql.repository.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @className: BookResolver.java
 * @date 2020/4/25 17:43
 * @description:
 */
@Component
@AllArgsConstructor
public class BookResolver implements GraphQLResolver<Book> {

    @Autowired
    private AuthorRepo authorRepo;

    public Author getAuthor(Book book) {
        return authorRepo.findAuthorById(book.getAuthorId());
    }
}
