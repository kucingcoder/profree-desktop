/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Controllers;

import com.profree.desktop.Models.Alternatif;
import com.profree.desktop.Models.Database;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author Hanif
 */
public class SPK {
    public static ArrayList<Alternatif> CariTerbaik(int id_produk, int id_bahasa){
        ArrayList<Alternatif> hasil = new ArrayList<>();
        
        ArrayList<Alternatif> daftar_orang = new ArrayList<>();
        
        try {
            Database data = new Database();
            ResultSet alt = data.Eksekusi("SELECT u.id, u.nama, u.projek, COUNT(DISTINCT c.bahasa_manusia_id) AS bahasa_komunikasi, (SELECT COUNT(k2.bahasa_pemograman_id) FROM kemampuan k2 WHERE k2.pengguna_id = u.id) AS bahasa_pemograman, u.pengalaman FROM pengguna u INNER JOIN kemampuan k ON u.id = k.pengguna_id INNER JOIN komunikasi c ON u.id = c.pengguna_id WHERE k.jenis_produk_id = "+id_produk+" AND k.bahasa_pemograman_id = "+id_bahasa+" AND u.jenis_akun_id = 1 AND u.status_akun_id = 2 GROUP BY u.id, u.nama, u.projek, u.pengalaman ORDER BY u.nama");
            
            System.out.println("\nAlternatif");
            while (alt.next()) {
                int id = alt.getInt("id");
                String nama = alt.getString("nama");
                double projek = alt.getInt("projek");
                double komunikasi = alt.getInt("bahasa_komunikasi");
                double pemograman = alt.getInt("bahasa_pemograman");
                double pengalaman = alt.getInt("pengalaman");
                
                Alternatif orang = new Alternatif(id, nama, projek, komunikasi, pemograman, pengalaman);
                daftar_orang.add(orang);
                
                System.out.println(nama + "|" + projek + "|" + komunikasi + "|" + pemograman + "|" + pengalaman);
            }
            
            ArrayList<double[]> perbandingan = new ArrayList<>();

            perbandingan.add(new double[]{1.00, 5.00, 3.00, 5.00});
            perbandingan.add(new double[]{0.20, 1.00, 1.00, 3.00});
            perbandingan.add(new double[]{0.33, 1.00, 1.00, 5.00});
            perbandingan.add(new double[]{0.20, 0.33, 0.20, 1.00});
            
            double sum_c1 = 0;
            double sum_c2 = 0;
            double sum_c3 = 0;
            double sum_c4 = 0;
            
            for(double[] daftar_nilai : perbandingan){
                sum_c1 += daftar_nilai[0];
                sum_c2 += daftar_nilai[1];
                sum_c3 += daftar_nilai[2];
                sum_c4 += daftar_nilai[3];
            }
            
            System.out.println("\nJumlah Perbandingan C1 : " + sum_c1);
            System.out.println("Jumlah Perbandingan C2 : " + sum_c2);
            System.out.println("Jumlah Perbandingan C3 : " + sum_c3);
            System.out.println("Jumlah Perbandingan C4 : " + sum_c4);
           
            ArrayList<double[]> normalisasi = new ArrayList<>();
            
            System.out.println("\nNormalisasi:");
            for(double[] nilai : perbandingan){
                double projek = nilai[0]/sum_c1;
                double komunikasi = nilai[1]/sum_c2;
                double pemograman = nilai[2]/sum_c3;
                double pengalaman = nilai[3]/sum_c4;
                
                double[] isi = new double[]{projek, komunikasi, pemograman, pengalaman};
                normalisasi.add(isi);
                System.out.println(projek + "|" + komunikasi + "|" + pemograman + "|" + pengalaman);
            }
            
            ArrayList<Double> bobot = new ArrayList<>();
            
            System.out.println("\nBobot:");
            for(double[] daftar_nilai : normalisasi){
                double nilai = (daftar_nilai[0] + daftar_nilai[1] + daftar_nilai[2] + daftar_nilai[3])/4;
                bobot.add(nilai);
                System.out.println(nilai);
            }
            
            ArrayList<Double> eigen_value = new ArrayList<>();
            
            System.out.println("\nEigen Value:");
            for (int i = 0; i < perbandingan.size(); i++) {
                double[] nilai = perbandingan.get(i);
                
                double perb_C1 = nilai[0];
                double perb_C2 = nilai[1];
                double perb_C3 = nilai[2];
                double perb_C4 = nilai[3];
                
                double bobot_C1 = bobot.get(0);
                double bobot_C2 = bobot.get(1);
                double bobot_C3 = bobot.get(2);
                double bobot_C4 = bobot.get(3);
                
                double nilai_eigen = (perb_C1*bobot_C1)+(perb_C2*bobot_C2)+(perb_C3*bobot_C3)+(perb_C4*bobot_C4);
                eigen_value.add(nilai_eigen);
                System.out.println(nilai_eigen);
            }
            
            double hasil_C1 = eigen_value.get(0)/bobot.get(0);
            double hasil_C2 = eigen_value.get(1)/bobot.get(1);
            double hasil_C3 = eigen_value.get(2)/bobot.get(2);
            double hasil_C4 = eigen_value.get(3)/bobot.get(3);
            
            
            double t = (hasil_C1+hasil_C2+hasil_C3+hasil_C4)/4;
            System.out.println("\nT : " + t);
            
            double ci = (t-4)/(4-1);
            System.out.println("\nCI : " + ci);
            
            double ri = 0.90;
            System.out.println("\nRI : " + ri);
            
            double konsistensi = ci/ri;
            System.out.print("\nKonsistensi : " + konsistensi);
            
            if (konsistensi <= 10 && konsistensi > 0) {
                System.out.println(" (konsisten)");
            } else {
                System.out.println(" (tidak konsisten)");
            }
            
            
            double perb_alt_C1 = 0;
            
            for(Alternatif orang : daftar_orang){
                perb_alt_C1 += orang.getProjek();
            }
            
            ArrayList<Double> C1 = new ArrayList<>();
            
            System.out.println("\nPerbandingan Alternatif C1");
            for(Alternatif orang : daftar_orang){
                double nilai = orang.getProjek() / perb_alt_C1;
                C1.add(nilai);
                System.out.println(nilai);
            }
            
            double perb_alt_C2 = 0;
            
            for(Alternatif orang : daftar_orang){
                perb_alt_C2 += orang.getKomunikasi();
            }
            
            ArrayList<Double> C2 = new ArrayList<>();
            
            System.out.println("\nPerbandingan Alternatif C2");
            for(Alternatif orang : daftar_orang){
                double nilai = orang.getKomunikasi() / perb_alt_C2;
                C2.add(nilai);
                System.out.println(nilai);
            }
            
            double perb_alt_C3 = 0;
            
            for(Alternatif orang : daftar_orang){
                perb_alt_C3 += orang.getPemograman();
            }
            
            ArrayList<Double> C3 = new ArrayList<>();
            
            System.out.println("\nPerbandingan Alternatif C3");
            for(Alternatif orang : daftar_orang){
                double nilai = orang.getPemograman() / perb_alt_C3;
                C3.add(nilai);
                System.out.println(nilai);
            }
            
            double perb_alt_C4 = 0;
            
            for(Alternatif orang : daftar_orang){
                perb_alt_C4 += orang.getPengalaman();
            }
            
            ArrayList<Double> C4 = new ArrayList<>();
            
            System.out.println("\nPerbandingan Alternatif C1");
            for(Alternatif orang : daftar_orang){
                double nilai = orang.getPengalaman() / perb_alt_C4;
                C4.add(nilai);
                System.out.println(nilai);
            }
            
            ArrayList<Double> nilai_rangking = new ArrayList<>();
            HashMap<Double, Alternatif> perangkingan = new HashMap<>();
            
            System.out.println("\nPerangkingan");
            for (int i = 0; i < daftar_orang.size(); i++) {
                double nilai_akhir = (C1.get(i)*bobot.get(0))+(C2.get(i)*bobot.get(1))+(C3.get(i)*bobot.get(2))+(C4.get(i)*bobot.get(3));
                nilai_rangking.add(nilai_akhir);
                perangkingan. put(nilai_akhir, daftar_orang.get(i));
                System.out.println(daftar_orang.get(i).getNama() + "(" + nilai_akhir + ")");
            }
            
            Collections.sort(nilai_rangking, Comparator.reverseOrder());
            
            System.out.println("\nSetelah diurutkan dari terbesar");
            for (int i = 0; i < nilai_rangking.size(); i++) {
                hasil.add(perangkingan.get(nilai_rangking.get(i)));
                System.out.println(perangkingan.get(nilai_rangking.get(i)).getNama());
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
        
        return hasil;
    }
}
