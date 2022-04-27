package com.example.student.repository;


import com.example.student.models.Studenstlist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface Studentslist extends CrudRepository <Studenstlist, Long> {

}
