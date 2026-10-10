package Tahap4;

public class Buku {
    private String judul;

    // Constructor
    public Buku(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    // Method info() (akan di-override di subclass)
    public void info() {
        System.out.println("Judul Buku: " + judul);
    }

    // Overloading: info berdasarkan tahun terbit
    public void info(int tahunTerbit) {
        System.out.println("Judul Buku: " + judul + ", Tahun Terbit: " + tahunTerbit);
    }

    // Overloading: info berdasarkan nama penulis
    public void info(String penulis) {
        System.out.println("Judul Buku: " + judul + ", Penulis: " + penulis);
    }
}
