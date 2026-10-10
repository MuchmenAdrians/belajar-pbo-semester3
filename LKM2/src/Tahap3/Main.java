package Tahap3;

public class Main {
    public static void main(String[] args) {
        // Percobaan 1: IPK 3.8
        Mahasiswa mhs = new Mahasiswa("Adriansyah", "2530801073", 3.8);
        mhs.tampilData();
        mhs.cekKelulusan();

        System.out.println();

        // Percobaan 2 (Pertanyaan b): IPK diubah menjadi 2.9
        Mahasiswa mhs2 = new Mahasiswa("Adriansyah", "2530801073", 2.9);
        mhs2.tampilData();
        mhs2.cekKelulusan();
    }
}