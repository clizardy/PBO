/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private String brand;
    private String tipe;
    private int tahunProduksi;
    private String warna;

    // Constructor
    public Mobil(String brand, String tipe, int tahunProduksi, String warna) {
        this.brand = brand;
        this.tipe = tipe;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
    }

    // Getter
    public String getBrand() {
        return brand;
    }

    public String getTipe() {
        return tipe;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public String getWarna() {
        return warna;
    }

    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("=== Informasi Mobil ===");
        System.out.println("Brand        : " + brand);
        System.out.println("Tipe         : " + tipe);
        System.out.println("Tahun        : " + tahunProduksi);
        System.out.println("Warna        : " + warna);
    }

    // Method tambahan
    public void nyalakanMesin() {
        System.out.println(">> Mesin " + brand + " " + tipe + " sedang dinyalakan...");
    }
}
