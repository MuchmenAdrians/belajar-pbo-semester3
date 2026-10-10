package Tahap5;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Much. Mentari Adriansyah";
        mhs.alamat = "Cirebon";
        mhs.nim = "2530801073";

        Dosen dsn = new Dosen();
        dsn.nama = "Raffi Santoso";
        dsn.alamat = "Cirebon";
        dsn.nidn = "1304107910";

        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama   : " + mhs.nama);
        System.out.println("Alamat : " + mhs.alamat);
        System.out.println("NIM    : " + mhs.nim);
        mhs.belajar();

        System.out.println();
        System.out.println("=== Data Dosen ===");
        System.out.println("Nama   : " + dsn.nama);
        System.out.println("Alamat : " + dsn.alamat);
        System.out.println("NIDN   : " + dsn.nidn);
        dsn.mengajar();
    }
}
