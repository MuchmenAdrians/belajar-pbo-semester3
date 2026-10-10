package Tahap5;

class Buku {
    String judul;
    String penulis;
    int jumlahHalaman;

    // Constructor
    Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    void tampilInfo() {
        System.out.println("Judul          : " + judul);
        System.out.println("Penulis        : " + penulis);
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }

    void cekTebal() {
        if (jumlahHalaman > 200) {
            System.out.println("Buku tebal");
        } else {
            System.out.println("Buku tipis");
        }
    }
}
