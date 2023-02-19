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
@Table(name ="tabel_dosen")
public class Dosen {

    @Id
    @Column(name = "id_dosen", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nama_dosen", nullable = false, length = 15)
    private String nama_dosen;
    @Column(name = "alamat")
    private String alamat;

    @Column(name = "tgl_lahir")
    private String tgl_lahir;

    @Column(name = "jenis_kelamin")
    private String jenis_kelamin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

}