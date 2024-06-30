/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Models;

/**
 *
 * @author Hanif
 */
public class Freelancer {
    private String nama;
    private int biaya_perjam;
    private int pengalaman;

    public Freelancer(String nama, int biaya_perjam, int pengalaman) {
        this.nama = nama;
        this.biaya_perjam = biaya_perjam;
        this.pengalaman = pengalaman;
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya_perjam() {
        return biaya_perjam;
    }

    public int getPengalaman() {
        return pengalaman;
    }
}
