package Tahap5;

public class MainPegawai {
    public static void main(String[] args) {
        Pegawai p1 = new PegawaiTetap("Adrian", 5000000, "Manajer IT");
        Pegawai p2 = new PegawaiKontrak("Hana", 3000000, "Akuntan");

        p1.tampilkanData();
        System.out.println("Gaji Total: Rp" + p1.hitungGajiTotal());
        System.out.println();

        p2.tampilkanData();
        System.out.println("Gaji Total: Rp" + p2.hitungGajiTotal());
    }
}
