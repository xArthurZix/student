package com.example.student.models;


import javax.persistence.*;

@Entity
@Table (name="studenstlist")
public class Studenstlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String first_name, last_name;
    private Integer value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
