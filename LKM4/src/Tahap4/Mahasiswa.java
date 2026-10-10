package Tahap4;

class Mahasiswa extends Person {
    String nim;

    void belajar() {
        System.out.println(nama + " dengan NIM " + nim + " sedang belajar di " + alamat);
        // nama   -> bisa (public)
        // alamat -> bisa (protected)
        // umur   -> tidak bisa (private)
    }
}
