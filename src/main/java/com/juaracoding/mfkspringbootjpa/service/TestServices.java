package com.juaracoding.mfkspringbootjpa.service;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 09/02/2023 20:29
@Last Modified 09/02/2023 20:29
Version 1.0
*/

import com.juaracoding.mfkspringbootjpa.model.Test;
import com.juaracoding.mfkspringbootjpa.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TestServices {


    private TestRepo testRepo;


    @Autowired
    public TestServices(TestRepo testRepo) {
        this.testRepo = testRepo;
    }


    public void saveAllTest(List<Test> ls){

        testRepo.saveAll(ls);
    }
}
