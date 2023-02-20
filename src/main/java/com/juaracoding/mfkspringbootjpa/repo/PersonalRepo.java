package com.juaracoding.mfkspringbootjpa.repo;/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 20/02/2023 19:45
@Last Modified 20/02/2023 19:45
Version 1.0
*/

import com.juaracoding.mfkspringbootjpa.model.Personal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;


public interface PersonalRepo extends JpaRepository<Personal,Long> {
    Page<Personal> findByNamaDepan(Pageable pages, String value);
    Page<Personal> findByNamaBelakang(Pageable pages, String value);
    Page<Personal> findByTanggalLahir(Pageable pages, String value);
    Page<Personal> findByAngkaRandomDesimal(Pageable pages, String value);
    Page<Personal> findByAngkaRandomBulat(Pageable pages, String value);

    Page<Personal> findByNamaDepanAndTanggalLahirBetween(
            Pageable pages,
            String value,
            LocalDate dateFrom,
            LocalDate dateTo);

    /*
        SELECT * FROM MstPersonal WHERE NamaDean = 'Adham'
     */
    Page<Personal> findByNamaBelakangAndTanggalLahirBetween(Pageable pages, String value, LocalDate dateFrom, LocalDate dateTo);
    Page<Personal> findByAngkaRandomDesimalAndTanggalLahirBetween(Pageable pages, Double value, LocalDate dateFrom, LocalDate dateTo);
    Page<Personal> findByAngkaRandomBulatAndTanggalLahirBetween(Pageable pages, Integer value, LocalDate dateFrom, LocalDate dateTo);

}