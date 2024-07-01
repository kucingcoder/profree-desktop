package com.profree.desktop.Controllers;

import com.profree.desktop.Models.Akun;
import com.profree.desktop.Models.Database;
import com.profree.desktop.Models.DuaData;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hanif
 */
public class DataAkun {
    public static Akun getDataDiri(){
        Akun pengguna = new Akun();
        try {
            Database data = new Database();
            ResultSet akun = data.Eksekusi("SELECT nama, jenis_kelamin_id, domisili, email, projek, pengalaman, biaya_perjam FROM pengguna WHERE id = " + Akun.getId());
            if (akun.next()) {
                String gender = "laki-laki";
                
                if (akun.getInt("jenis_kelamin_id") == 2) {
                    gender = "perempuan";    
                }
                
                pengguna = new Akun(akun.getString("email"), akun.getString("nama"), gender, akun.getString("domisili"), akun.getInt("projek"), akun.getInt("pengalaman"), akun.getInt("biaya_perjam"));
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
        
        return pengguna;
    }
    
    public static void updateDataDiri(Akun pengguna){
        try {
            Database data = new Database();
            
            int id_jk = 1;
            
            if ("perempuan".equals(pengguna.getJenis_kelamin())) {
                id_jk = 2;
            }
            
            data.SetData("UPDATE pengguna set nama = '"+pengguna.getNama()+"', jenis_kelamin_id="+id_jk+", domisili = '"+pengguna.getDomisili()+"', email = '"+pengguna.getEmail()+"', projek = "+pengguna.getJumlah_projek()+", pengalaman = "+pengguna.getPengalaman()+", biaya_perjam = "+pengguna.getBiaya_perjam()+" WHERE id = " + Akun.getId());
            
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan perubahan yang anda buat!", "Data Diri Diperbaharui", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static void gantiSandi(String sandi_lama, String sandi_baru){
        try {
            Database data = new Database();
            
            ResultSet akun = data.Eksekusi("SELECT 1 AS ada FROM pengguna WHERE sandi = MD5('"+sandi_lama+"') and id = " + Akun.getId());
            if (akun.next()) {
                data.SetData("UPDATE pengguna SET sandi = MD5('"+sandi_baru+"') WHERE id = " + Akun.getId());
                JOptionPane.showMessageDialog(null, "Berhasil menyimpan perubahan yang anda buat!", "Sandi Diperbaharui", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Kata sandi lama salah!", "Gagal Ganti Sandi", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static String getDeskripsi(){
        String deskripsi = "";
        
        try {
            Database data = new Database();
            
            ResultSet akun = data.Eksekusi("SELECT deskripsi FROM pengguna WHERE id = " + Akun.getId());
            if (akun.next()) {
                deskripsi = akun.getString("deskripsi");
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
        
        return deskripsi;
    }
    
    public static void updateDeskripsi(String deskripsi){
        try {
            Database data = new Database();
            data.SetData("UPDATE pengguna SET deskripsi = '"+deskripsi+"' WHERE id = " + Akun.getId());
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan perubahan yang anda buat!", "Deskripsi Diperbaharui", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static DuaData getKemampuan(){
        
        DuaData isi = new DuaData();
        
        ArrayList<String> daftar_kemampuan = new ArrayList<>();
        ArrayList<Integer> daftar_id = new ArrayList<>();
        
        try {
            Database data = new Database();
            ResultSet kemampuan = data.Eksekusi("SELECT kemampuan.id AS id, jenis_produk.nama AS produk, bahasa_pemograman.nama AS bahasa FROM kemampuan INNER JOIN jenis_produk ON jenis_produk.id = jenis_produk_id INNER JOIN bahasa_pemograman ON bahasa_pemograman.id = bahasa_pemograman_id WHERE kemampuan.pengguna_id = " + Akun.getId());
            while (kemampuan.next()) {
                daftar_kemampuan.add(kemampuan.getString("produk") + " - " + kemampuan.getString("bahasa"));
                daftar_id.add(kemampuan.getInt("id"));
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
        
        isi = new DuaData(daftar_id, daftar_kemampuan);
        
        return isi;
    }
    
    public static void tambahKemampuan(int id_produk, int id_bahasa){
        try {
            Database data = new Database();
            data.SetData("INSERT INTO kemampuan (pengguna_id, jenis_produk_id, bahasa_pemograman_id) VALUES ("+Akun.getId()+", "+id_produk+", "+id_bahasa+")");
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data yang anda buat!", "Menambah Kemampuan", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static void hapusKemampuan(int id){
        try {
            Database data = new Database();
            data.SetData("DELETE FROM kemampuan WHERE id = " + id);
            JOptionPane.showMessageDialog(null, "Berhasil menghapus item!", "Hapus Kemampuan", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static void gantiKemampuan(int id, int id_produk, int id_bahasa){
         try {
            Database data = new Database();
            data.SetData("UPDATE kemampuan SET jenis_produk_id = "+id_produk+", bahasa_pemograman_id = "+id_bahasa+" WHERE id = " + id);
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan perubahan yang anda buat!", "Ubah Kemampuan", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static DuaData getKantor(){
        
        DuaData isi = new DuaData();
        
        ArrayList<String> daftar_platform = new ArrayList<>();
        ArrayList<Integer> daftar_id = new ArrayList<>();
        
        try {
            Database data = new Database();
            ResultSet tempat_kerja = data.Eksekusi("SELECT tempat_kerja.id AS id, platform.nama AS platform, tempat_kerja.profil AS profil FROM tempat_kerja INNER JOIN platform ON platform.id = platform_id WHERE tempat_kerja.pengguna_id = " + Akun.getId());
            while (tempat_kerja.next()) {
                daftar_platform.add(tempat_kerja.getString("platform") + " - " + tempat_kerja.getString("profil"));
                daftar_id.add(tempat_kerja.getInt("id"));
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
        
        isi = new DuaData(daftar_id, daftar_platform);
        
        return isi;
    }
    
    public static void tambahKantor(int id_platform, String profil){
        try {
            Database data = new Database();
            data.SetData("INSERT INTO tempat_kerja (pengguna_id, platform_id, profil) VALUES ("+Akun.getId()+", "+id_platform+", '"+profil+"')");
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data yang anda buat!", "Menambah Kantor", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static void hapusKantor(int id){
        try {
            Database data = new Database();
            data.SetData("DELETE FROM tempat_kerja WHERE id = " + id);
            JOptionPane.showMessageDialog(null, "Berhasil menghapus item!", "Hapus Kantor", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static void gantiKantor(int id, int id_platform, String profil){
         try {
            Database data = new Database();
            data.SetData("UPDATE tempat_kerja SET platform_id = "+id_platform+", profil = '"+profil+"' WHERE id = " + id);
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan perubahan yang anda buat!", "Ubah Kantor", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
}
