package com.ashika.thymleafapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashika.thymleafapp.models.Student;

@Repository
public interface StudnetRepository extends CrudRepository<Student,Integer> {

}
