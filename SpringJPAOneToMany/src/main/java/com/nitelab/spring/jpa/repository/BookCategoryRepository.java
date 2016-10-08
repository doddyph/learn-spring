package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by dph on 08/10/16.
 */
//@Repository
//public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {
@RepositoryRestResource(collectionResourceRel = "category", path = "categories")
public interface BookCategoryRepository extends PagingAndSortingRepository<BookCategory, Integer> {
}
