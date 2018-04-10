package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Application;

import io.swagger.annotations.Api;

@RepositoryRestResource(exported = true)
@Api(tags={"Application Repository"})
public interface ApplicationRepository extends CrudRepository<Application, String> {

}
