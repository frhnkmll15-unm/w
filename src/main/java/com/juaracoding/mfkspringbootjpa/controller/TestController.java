package com.juaracoding.mfkspringbootjpa.controller;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 14/02/2023 21:20
@Last Modified 14/02/2023 21:20
Version 1.0
*/


import com.juaracoding.mfkspringbootjpa.handler.ResponseHandler;
import com.juaracoding.mfkspringbootjpa.model.Test;
import com.juaracoding.mfkspringbootjpa.service.TestServices;
import com.juaracoding.mfkspringbootjpa.utils.ConstantMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
public class TestController {



    private TestServices testServices;

    @Autowired
    public TestController(TestServices testServices) {
        this.testServices = testServices;
    }

    @PostMapping("/v1/s")
    public ResponseEntity<Object> saveAll(
            @RequestBody List<Test> listTest
    ){

        testServices.saveAllTest(listTest);

        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_FIND_BY, HttpStatus.OK,null,null,null);

    }
}
