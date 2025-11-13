/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_5;

/**
 *
 * @author ASUS
 */
public class Main {
     public static void main(String[] args) {
        // Hewan
        Kucing kucing = new Kucing();
        kucing.nama = "Geckko";
        kucing.jenis = "Anggora";
        kucing.tampilkanInfo();
        kucing.suara();

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.nama = "Scruch";
        anjing.jenis = "Himalayan";
        anjing.tampilkanInfo();
        anjing.suara();
    }
}
