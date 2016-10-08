package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Penerbit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by dph on 08/10/16.
 */
//@Repository
//public interface PenerbitRepository extends JpaRepository <Penerbit, Integer> {
@RepositoryRestResource(collectionResourceRel = "penerbit", path = "penerbit")
public interface PenerbitRepository extends PagingAndSortingRepository<Penerbit, Integer> {
}
