/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Models;

/**
 *
 * @author Hanif
 */
public class Alternatif {
    int id;
    private String nama;
    private double projek, komunikasi, pemograman, pengalaman;

    public Alternatif(int id, String nama, double projek, double komunikasi, double pemograman, double pengalaman) {
        this.id = id;
        this.nama = nama;
        this.projek = projek;
        this.komunikasi = komunikasi;
        this.pemograman = pemograman;
        this.pengalaman = pengalaman;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getProjek() {
        return projek;
    }

    public double getKomunikasi() {
        return komunikasi;
    }

    public double getPemograman() {
        return pemograman;
    }

    public double getPengalaman() {
        return pengalaman;
    }
}
