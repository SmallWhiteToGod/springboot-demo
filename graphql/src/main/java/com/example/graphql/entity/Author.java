package com.example.graphql.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @className: Author.java
 * @date 2020/4/25 17:19
 * @description:
 */

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Author extends BaseEntity {

    @Column(columnDefinition = "varchar(50)")
    private String firstName;

    @Column(columnDefinition = "varchar(50)")
    private String lastName;
}
