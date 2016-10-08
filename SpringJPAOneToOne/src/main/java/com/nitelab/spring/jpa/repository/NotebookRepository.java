package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Notebook;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by dph on 09/10/16.
 */
@RepositoryRestResource(collectionResourceRel = "notebook", path = "notebook")
public interface NotebookRepository extends PagingAndSortingRepository<Notebook, Integer> {
}
