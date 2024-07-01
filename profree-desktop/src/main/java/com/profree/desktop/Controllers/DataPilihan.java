/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Controllers;

import com.profree.desktop.Models.Akun;
import com.profree.desktop.Models.Database;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hanif
 */
public class DataPilihan {
    public static ArrayList<String> getDaftar(String tabel) {
        ArrayList<String> daftar = new ArrayList<>();
        
        try {
            Database data = new Database();
            
            ResultSet jenis = data.Eksekusi("SELECT nama FROM " + tabel);
            
            while (jenis.next()) {
                daftar.add(jenis.getString("nama"));
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
        
        return daftar;
    }
}
