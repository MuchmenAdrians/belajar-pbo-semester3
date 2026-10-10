package Tahap3;

class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Constructor
    Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }

    // Method tambahan Tahap 3
    void cekKelulusan() {
        if (ipk >= 3.0) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Perlu perbaikan");
        }
    }
}