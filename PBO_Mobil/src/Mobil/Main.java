/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat dua object mobil
        Mobil m1 = new Mobil("Suzuki", "Ertiga", 2019, "Putih");
        Mobil m2 = new Mobil("Mitsubishi", "Xpander", 2021, "Abu-abu");

        // Menjalankan method
        m1.nyalakanMesin();
        m1.tampilkanInfo();

        System.out.println();

        m2.nyalakanMesin();
        m2.tampilkanInfo();

        // Mengubah warna menggunakan setter
        m2.setWarna("Hitam");

        System.out.println("\n>> Setelah dilakukan perubahan warna:");
        m2.tampilkanInfo();
    }
}
