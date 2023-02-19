package com.juaracoding.mfkspringbootjpa.utils;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 15/02/2023 17:10
@Last Modified 15/02/2023 17:10
Version 1.0
*/


import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransformToDTO {



    public Map<String,Object> transformObject(Map<String,Object> mapz, List ls, Page page)
    {
        mapz.put("data",ls);
        mapz.put("currentPage",page.getNumber());
        mapz.put("totalItems",page.getTotalElements());
        mapz.put("totalPages",page.getTotalPages());
        mapz.put("sort",page.getSort());
        mapz.put("numberOfElements",page.getNumberOfElements());

        return mapz;
    }
}
