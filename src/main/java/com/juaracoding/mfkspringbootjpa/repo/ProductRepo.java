package com.juaracoding.mfkspringbootjpa.repo;

import com.juaracoding.mfkspringbootjpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {


}