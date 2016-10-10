package com.nitelab.spring.jpa.repository;

import com.nitelab.spring.jpa.model.Karyawan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SRIN on 10/10/2016.
 */
@RepositoryRestResource(collectionResourceRel = "karyawan", path = "karyawan")
public interface KaryawanRepository extends PagingAndSortingRepository<Karyawan, Long> {
}
