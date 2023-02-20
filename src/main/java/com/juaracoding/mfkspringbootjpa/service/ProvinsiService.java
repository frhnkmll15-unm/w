package com.juaracoding.mfkspringbootjpa.service;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 19/02/2023 23:41
@Last Modified 19/02/2023 23:41
Version 1.0
*/
import com.juaracoding.mfkspringbootjpa.model.Provinsi;
import com.juaracoding.mfkspringbootjpa.repo.ProvinsiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ProvinsiService {

    private ProvinsiRepo provinsiRepo;
    private String [] strExceptionArr = new String[2];


    @Autowired
    public ProvinsiService(ProvinsiRepo provinsiRepo) {
        strExceptionArr[0] = "ProvinsiService";
        this.provinsiRepo = provinsiRepo;
    }
    @Transactional(rollbackFor = Exception.class)
    public void saveProvinsi(Provinsi provinsi){

        provinsiRepo.save(provinsi);

    }
    @Transactional(rollbackFor = Exception.class)
    public void saveAllProvinsi(List<Provinsi> listProvinsi){
        provinsiRepo.saveAll(listProvinsi);
    }
}
