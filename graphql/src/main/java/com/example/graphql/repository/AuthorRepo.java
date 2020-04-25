package com.example.graphql.repository;

import com.example.graphql.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @className: AuthorRepo.java
 * @date 2020/4/25 17:38
 * @description:
 */
public interface AuthorRepo extends JpaRepository<Author,Long> {

    Author findAuthorById(Long id);
}
