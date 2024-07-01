/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Models;

/**
 *
 * @author Hanif
 */
public class SPKProgramerTerbaik {
    private String nama;
    private int id, biaya, pengalaman;

    public SPKProgramerTerbaik() {
    }

    public SPKProgramerTerbaik(String nama, int biaya, int pengalaman) {
        this.nama = nama;
        this.biaya = biaya;
        this.pengalaman = pengalaman;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public int getBiaya() {
        return biaya;
    }

    public int getPengalaman() {
        return pengalaman;
    }
}
