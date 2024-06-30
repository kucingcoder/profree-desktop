/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hanif
 */
public class Database {
    public static Connection conn;
    
    public static void Sambungkan() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://serverku.my.id/UAS","publik", "123");
    }
    
    public static Connection Sambungan() {
        return conn;
    }
    
    public ResultSet Eksekusi(String kueri) throws Exception{
        Statement stmt;
        ResultSet rs;
        
        stmt = conn.createStatement();
        rs = stmt.executeQuery(kueri);
        
        return rs;
    }
    
    public void SetData (String kueri) throws Exception {
        Statement stmt;
        stmt = conn.createStatement();
        stmt.executeUpdate(kueri);
    }
}
