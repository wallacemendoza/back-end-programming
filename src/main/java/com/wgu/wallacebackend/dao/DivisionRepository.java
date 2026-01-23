package com.wgu.wallacebackend.dao;

import com.wgu.wallacebackend.entities.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface DivisionRepository extends JpaRepository<Division, Long> {

    // supports: /api/divisions/search/findByCountryId?id=1
    @RestResource(path = "findByCountryId", rel = "findByCountryId")
    List<Division> findByCountryId(@Param("id") Long id);
}
