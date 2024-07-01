/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Controllers;

import com.profree.desktop.Models.Database;
import com.profree.desktop.Models.SPKProgramerTerbaik;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hanif
 */
public class SPK {
    public static ArrayList<SPKProgramerTerbaik> CariTerbaik(int id_produk, int id_bahasa){
        ArrayList<SPKProgramerTerbaik> hasil = new ArrayList<>();
        
        try {
            Database data = new Database();
            ResultSet alternatif = data.Eksekusi("");
            while (alternatif.next()) {
                
            }
        } catch (Exception e) {
        }
        
        return hasil;
    }
}
