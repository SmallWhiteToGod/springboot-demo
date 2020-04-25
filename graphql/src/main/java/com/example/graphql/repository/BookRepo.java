package com.example.graphql.repository;

import com.example.graphql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @className: BookRepo.java
 * @date 2020/4/25 17:39
 * @description:
 */
public interface BookRepo extends JpaRepository<Book,Long> {
    List<Book> findByAuthorId(Long id);

    Book findBookById(Long id);
}
