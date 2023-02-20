package com.juaracoding.mfkspringbootjpa.controller;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 19/02/2023 23:36
@Last Modified 19/02/2023 23:36
Version 1.0
*/

import com.juaracoding.mfkspringbootjpa.handler.ResponseHandler;
import com.juaracoding.mfkspringbootjpa.model.Provinsi;
import com.juaracoding.mfkspringbootjpa.service.ProvinsiService;
import com.juaracoding.mfkspringbootjpa.utils.ConstantMessage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/prov")
public class ProvinsiController {

    private ProvinsiService provinsiService;
    private String [] strExceptionArr = new String[2];

    @Autowired
    private ModelMapper modelMapper;

    private Map<String,Object> objectMapper = new HashMap<String,Object>();
    List<Provinsi> lsCPUpload = new ArrayList<Provinsi>();

    @Autowired
    public ProvinsiController(ProvinsiService provinsiService) {
        strExceptionArr[0] = "ProvinsiController";
        this.provinsiService = provinsiService;
    }

    @PostMapping("/v2/save")
    public ResponseEntity<Object> saveProvinsi(@Valid
                                               @RequestBody Provinsi provinsi
    ){

        provinsiService.saveProvinsi(provinsi);

        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_FIND_BY, HttpStatus.OK,null,null,null);
    }


    @PostMapping("/v2/saveAll")
    public ResponseEntity<Object> saveProvinsiList(@Valid
                                                   @RequestBody List<Provinsi> listProvinsi
    ){

        provinsiService.saveAllProvinsi(listProvinsi);

        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_SAVE, HttpStatus.CREATED,null,null,null);

    }

}
