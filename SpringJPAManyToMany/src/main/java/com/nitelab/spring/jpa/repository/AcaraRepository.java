package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Acara;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;

/**
 * Created by SRIN on 10/10/2016.
 */
@RepositoryRestResource(collectionResourceRel = "acara", path = "acara")
public interface AcaraRepository extends PagingAndSortingRepository<Acara, Long> {
}
