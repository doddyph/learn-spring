package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by dph on 08/10/16.
 */
@RepositoryRestResource(collectionResourceRel = "client", path = "clients")
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

    List<Client> findByName(@Param("name") String name);

//    @Query("SELECT c.Name FROM Client c WHERE c.id = :id")
//    Client findNameById(@Param("id") Long id);

    List<Client> findByNameOrderByName(@Param("name") String name);
}
