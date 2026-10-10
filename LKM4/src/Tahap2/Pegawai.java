package Tahap2;

class Pegawai {
    String nama;
    int gaji;

    Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    void info() {
        System.out.println("Nama: " + nama + ", Gaji: " + gaji);
    }
}
