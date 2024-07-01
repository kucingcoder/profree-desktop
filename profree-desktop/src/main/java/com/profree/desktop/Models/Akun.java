/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Models;
/**
 *
 * @author Hanif
 */
public class Akun {
    public static int id;
    private String email, sandi, nama, jenis_kelamin, jenis_akun, domisili;
    private int jumlah_projek, pengalaman, biaya_perjam;
    
    public Akun() {}

    public Akun(String email, String nama, String jenis_kelamin, String domisili, int jumlah_projek, int pengalaman, int biaya_perjam) {
        this.email = email;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.domisili = domisili;
        this.jumlah_projek = jumlah_projek;
        this.pengalaman = pengalaman;
        this.biaya_perjam = biaya_perjam;
    }
    
    public Akun(String email, String sandi, String nama, String jenis_kelamin, String jenis_akun){
        this.email = email;
        this.sandi = sandi;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.jenis_akun = jenis_akun;
    }
    
    public Akun(String email, String sandi) {
        this.email = email;
        this.sandi = sandi;
    }

    public static int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSandi() {
        return sandi;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getJenis_akun() {
        return jenis_akun;
    }

    public String getDomisili() {
        return domisili;
    }

    public int getJumlah_projek() {
        return jumlah_projek;
    }

    public int getPengalaman() {
        return pengalaman;
    }

    public int getBiaya_perjam() {
        return biaya_perjam;
    }
}
