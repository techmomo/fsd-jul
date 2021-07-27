package com.mohsinkd786.repository;

import com.mohsinkd786.entity.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project,Integer> {

    //List<Project> findProjectsByNameLikeOrderByBudget(String projectName);

    List<Project> findProjectsByNameStartsWith(String projectName);

    //@Query("SELECT p FROM Project p WHERE p.name LIKE %?1% ")
    @Query("SELECT m FROM Project m WHERE m.name LIKE %:pname%")
    List<Project> findProjectsByNameAndOrderByBudget(@Param("pname") String name);
}
