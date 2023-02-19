package com.juaracoding.mfkspringbootjpa.service;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 09/02/2023 21:46
@Last Modified 09/02/2023 21:46
Version 1.0
*/


import com.juaracoding.mfkspringbootjpa.model.Person;
import com.juaracoding.mfkspringbootjpa.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
@Transactional
public class PersonService  {

    private PersonRepo personRepo;


    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public void savePerson(Person person){

        List<Person> l = new ArrayList<>();
        List<Person> ll = new LinkedList<>();
        List<Person> lll = new Vector<>();

        Pageable p = null;
        personRepo.save(person);
        personRepo.findAll();
        personRepo.findByFirstName(person.getFirstName());

    }

    public List<Person> findByName(Person person){
        return personRepo.findByFirstName(person.getFirstName());

    }
}
