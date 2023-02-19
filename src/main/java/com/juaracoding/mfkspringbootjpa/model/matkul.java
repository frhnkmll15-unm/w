package com.juaracoding.mfkspringbootjpa.model;

import javax.persistence.*;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 09/02/2023 21:46
@Last Modified 09/02/2023 21:46
Version 1.0
*/
@Entity
@Table(name ="tabel_matkul")
public class matkul {

    @Id
    @Column(name = "Id_matkul", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nama_matkul")
    private String nama_matkul;
    @Column(name = "Jenis_matkul")
    private String jenis_matkul;

    @Column(name = "Semester")
    private String semester;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public String getJenis_matkul() {
        return jenis_matkul;
    }

    public void setJenis_matkul(String jenis_matkul) {
        this.jenis_matkul = jenis_matkul;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getId_dosen() {
        return id_dosen;
    }

    public void setId_dosen(String id_dosen) {
        this.id_dosen = id_dosen;
    }

    @Column(name = "Id_dosen")
    private String id_dosen;



}