package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Module;

import io.swagger.annotations.Api;

@RepositoryRestResource(exported = true)
@Api(tags={"Module Repository"})
public interface ModuleRepository extends CrudRepository<Module, String> {

}
