package Tahap4;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        Persegi persegi = new Persegi();

        persegi.sisi = 5;

        System.out.println("=== PERSEGI ===");
        System.out.println("Luas = " + persegi.hitungLuas());
        System.out.println("Keliling = " + persegi.hitungKeliling());

        System.out.println();
        System.out.println("=== PERSEGI PANJANG ===");
        PersegiPanjang persegiPanjang = new PersegiPanjang(10,5);

        System.out.println("Luas = "+ persegiPanjang.hitungLuas());
        System.out.println("Keliling = "+ persegiPanjang.hitungKeliling());

        Segitiga segitiga = new Segitiga();

        segitiga.alas = 6;
        segitiga.tinggi = 4;

        segitiga.sisi1 = 5;
        segitiga.sisi2 = 5;
        segitiga.sisi3 = 6;

        System.out.println();
        System.out.println("=== SEGITIGA ===");
        System.out.println("Luas = " + segitiga.hitungLuas());
        System.out.println("Keliling = " + segitiga.hitungKeliling());
    }
}