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
    private int pengalaman;

    public Freelancer(String nama, int pengalaman) {
        this.nama = nama;
        this.pengalaman = pengalaman;
    }

    public String getNama() {
        return nama;
    }

    public int getPengalaman() {
        return pengalaman;
    }
}
