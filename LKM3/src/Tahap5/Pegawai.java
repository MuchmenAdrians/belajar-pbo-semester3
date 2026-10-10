package Tahap5;

public abstract class Pegawai {
    private String nama;
    private double gaji;
    private String jabatan;

    public Pegawai(String nama, double gaji, String jabatan) {
        this.nama = nama;
        this.gaji = gaji;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    public String getJabatan() {
        return jabatan;
    }

    // Method abstrak, wajib diisi oleh class turunan
    public abstract double hitungGajiTotal();

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: Rp" + gaji);
    }
}
