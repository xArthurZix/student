package com.example.student.controllers;

import com.example.student.models.Studenstlist;
import com.example.student.repository.Studentslist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentsController {

    @Autowired
    private Studentslist studentslist;

    @GetMapping("/students")
    public Iterable<Studenstlist> studentlist() {
        return studentslist.findAll();
    }



}






