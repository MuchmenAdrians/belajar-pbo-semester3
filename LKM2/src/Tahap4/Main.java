package Tahap4;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Adriansyah", "2530801073", 3.8);

        // mhs.ipk = 10; // ERROR: ipk has private access in Mahasiswa

        System.out.println("Data awal:");
        mhs.tampilData();
        mhs.cekKelulusan();

        System.out.println();
        System.out.println("Ubah IPK jadi 2.9 lewat setter:");
        mhs.setIpk(2.9);
        System.out.println("IPK sekarang: " + mhs.getIpk());
        mhs.cekKelulusan();

        System.out.println();
        System.out.println("Coba isi IPK tidak valid (5.5):");
        mhs.setIpk(5.5);
        System.out.println("IPK tetap: " + mhs.getIpk());
    }
}