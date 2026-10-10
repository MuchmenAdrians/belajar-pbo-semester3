package Tahap3;

public class Main {
    public static void main(String[] args) {
        Burung b = new Burung();
        b.nama = "Merpati";
        b.warnaBulu = "Putih";
        b.makan();
        b.terbang();

        Ikan i = new Ikan();
        i.nama = "Nemo";
        i.jenisAir = "Laut";
        i.makan();
        i.berenang();
    }
}
