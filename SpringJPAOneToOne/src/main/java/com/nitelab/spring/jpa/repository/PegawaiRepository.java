package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Pegawai;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SRIN on 10/10/2016.
 */
@RepositoryRestResource(collectionResourceRel = "pegawai", path = "pegawai")
public interface PegawaiRepository extends PagingAndSortingRepository<Pegawai, Long> {
}
