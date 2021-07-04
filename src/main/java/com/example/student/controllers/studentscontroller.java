package com.example.student.controllers;

import com.example.student.repository.studentslist;
import com.example.student.models.studenstlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class studentscontroller {



    @Autowired
    private studentslist studentslist;
    @GetMapping("/students")
    public String studentlist( Model model) {

        Iterable<studenstlist> alllist = studentslist.findAll();
        model.addAttribute("studentsall", alllist);
        return "students";
    }



}






