package com.juaracoding.mfkspringbootjpa.controller;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Administrator a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 2/10/2023 10:58 AM
@Last Modified 2/10/2023 10:58 AM
Version 1.0
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestApi {


	@GetMapping("/Api")
	public String anuan(){
		return "Oke Bro";
	}
}

