/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Models;

/**
 *
 * @author Hanif
 */
public class Riwayat {
    private String judul, nama_freelancer_terbaik, produk, bahasa_pemograman;

    public Riwayat(String judul, String nama_freelancer_terbaik, String produk, String bahasa_pemograman) {
        this.judul = judul;
        this.nama_freelancer_terbaik = nama_freelancer_terbaik;
        this.produk = produk;
        this.bahasa_pemograman = bahasa_pemograman;
    }

    public String getJudul() {
        return judul;
    }

    public String getNama_freelancer_terbaik() {
        return nama_freelancer_terbaik;
    }

    public String getProduk() {
        return produk;
    }

    public String getBahasa_pemograman() {
        return bahasa_pemograman;
    }
}
