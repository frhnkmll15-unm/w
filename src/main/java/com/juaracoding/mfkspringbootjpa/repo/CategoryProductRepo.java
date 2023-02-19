package com.juaracoding.mfkspringbootjpa.repo;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 09/02/2023 20:29
@Last Modified 09/02/2023 20:29
Version 1.0
*/

import com.juaracoding.mfkspringbootjpa.model.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryProductRepo extends JpaRepository<CategoryProduct,Long> {


//    List<CategoryProduct> findByNameCategoryProduct(String value);

    /*
        findByNameCategoryProduct
        SELECT * FROM MstCategoryProduct WHERE NameCategoryProduct = ?
    */
}
