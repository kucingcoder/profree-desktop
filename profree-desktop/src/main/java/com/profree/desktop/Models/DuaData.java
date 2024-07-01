/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.profree.desktop.Models;

import java.util.ArrayList;

/**
 *
 * @author Hanif
 */
public class DuaData {
    private ArrayList<Integer> data1;
    private ArrayList<String> data2;

    public DuaData() {
    }

    public DuaData(ArrayList<Integer> data1, ArrayList<String> data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public ArrayList<Integer> getData1() {
        return data1;
    }

    public ArrayList<String> getData2() {
        return data2;
    }
}
