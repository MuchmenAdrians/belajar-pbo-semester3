package Tahap4;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();

        // akses atribut public
        m.nama = "Adrian";

        // akses atribut protected (masih dalam package yang sama)
        m.alamat = "Kota Cirebon";

        // akses atribut private tidak bisa langsung -> gunakan setter
        m.setUmur(20);

        m.nim = "2530801073";
        m.belajar();

        System.out.println("Umur Mahasiswa: " + m.getUmur());
    }
}
