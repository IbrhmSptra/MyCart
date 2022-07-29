/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.MyCart;


/**
 *
 * @author Ibrahim Saputra
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // go to login
        login login = new login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
    }
    
}
