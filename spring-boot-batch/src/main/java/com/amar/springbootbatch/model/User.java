package com.amar.springbootbatch.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private String dept;
    private Integer Sal;

    public User() {
    }

    public User(Integer id, String name, String dept, Integer sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        Sal = sal;
    }
}
