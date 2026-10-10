package Tahap5;

public class MainBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku("Pemrograman Java Dasar", "Andi Wijaya", 350);
        Buku b2 = new Buku("Panduan Singkat OOP", "Siti Rahma", 120);

        b1.tampilInfo();
        b1.cekTebal();

        System.out.println();

        b2.tampilInfo();
        b2.cekTebal();
    }
}