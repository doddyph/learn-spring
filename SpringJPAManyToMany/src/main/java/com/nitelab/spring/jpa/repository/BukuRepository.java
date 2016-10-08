package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by dph on 08/10/16.
 */
//@Repository
//public interface BukuRepository extends JpaRepository<Buku, Integer> {
@RepositoryRestResource(collectionResourceRel = "buku", path = "buku")
public interface BukuRepository extends PagingAndSortingRepository<Buku, Integer> {
}
