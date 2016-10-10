package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SRIN on 10/10/2016.
 */
@RepositoryRestResource(collectionResourceRel = "company", path = "company")
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long> {
}
