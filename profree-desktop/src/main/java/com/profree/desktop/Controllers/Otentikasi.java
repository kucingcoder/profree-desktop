/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Controllers;

import com.profree.desktop.Models.Akun;
import com.profree.desktop.Models.Database;
import com.profree.desktop.Views.Dashboard;
import com.profree.desktop.Views.Login;
import com.profree.desktop.Views.Main;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Hanif
 */
public class Otentikasi {
    public static void Masuk(Akun pengguna){
        try {
            Database data = new Database();
            ResultSet akun = data.Eksekusi("SELECT id FROM pengguna WHERE email = '"+pengguna.getEmail()+"' AND sandi = MD5('"+pengguna.getSandi()+"')");
            if (akun.next()) {
                Akun.id = akun.getInt("id");
                
                System.out.println("ID : " + Akun.getId());
                
                Main.konten.removeAll();
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                Main.konten.add(dashboard);
            } else {
               JOptionPane.showMessageDialog(null, "Email atau sandi salah!", "Gagal Masuk", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    } 
    
    public static void Daftar(Akun pengguna){
        try {
            Database data = new Database();
            
            int id_jk = 1;
            int id_ja = 1;
            
            if ("perempuan".equals(pengguna.getJenis_kelamin())) {
                id_jk = 2;
            }
            
            if ("project manager".equals(pengguna.getJenis_kelamin())) {
                id_jk = 2;
            }
            
            data.SetData("INSERT INTO pengguna (email, sandi, nama, jenis_kelamin_id, jenis_akun_id, status_akun_id) VALUES ('"+pengguna.getEmail()+"', MD5('"+pengguna.getSandi()+"'), '"+pengguna.getNama()+"', "+id_jk+", "+id_ja+", 2)");
            
            ResultSet akun = data.Eksekusi("SELECT id FROM pengguna WHERE email = '"+pengguna.getEmail()+"' AND sandi = MD5('"+pengguna.getSandi()+"')");
            if (akun.next()) {
                Akun.id = akun.getInt("id");
                
                System.out.println("ID : " + Akun.getId());
                
                Main.konten.removeAll();
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                Main.konten.add(dashboard);
            }
        } catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());
        }
    }
    
    public static void Keluar(){
        Akun.id = 0;
        System.out.println("ID : " + Akun.getId());
        
        Main.konten.removeAll();
        Login login = new Login();
        login.setVisible(true);
        Main.konten.add(login);
    }
}
