package com.juaracoding.mfkspringbootjpa.repo;


import com.juaracoding.mfkspringbootjpa.model.CategoryProduct;
        import org.springframework.data.jpa.repository.JpaRepository;
        import java.util.List;

public interface CategoryRepo extends JpaRepository<CategoryProduct,Long> {



    List<CategoryProduct> findByNameCategoryProduct(String value);

    /*
        findByNameCategoryProduct
        SELECT * FROM MstCategoryProduct WHERE NameCategoryProduct = ?
    */
}
