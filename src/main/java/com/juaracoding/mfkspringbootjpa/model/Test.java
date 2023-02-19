package com.juaracoding.mfkspringbootjpa.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 14/02/2023 21:15
@Last Modified 14/02/2023 21:15
Version 1.0
*/


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "MstTest")
public class Test {


    @Id
    @Column(name = "IDTest")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DateTest" , nullable = false)
    private LocalDate dateTest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateTest() {
        return dateTest;
    }

    public void setDateTest(LocalDate dateTest) {
        this.dateTest = dateTest;
    }
}
