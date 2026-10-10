package Tahap5;

public class PegawaiKontrak extends Pegawai implements Tunjangan {

    public PegawaiKontrak(String nama, double gaji, String jabatan) {
        super(nama, gaji, jabatan);
    }

    @Override
    public double hitungTunjangan() {
        return getGaji() * 0.05;
    }

    @Override
    public double hitungGajiTotal() {
        return getGaji() + hitungTunjangan();
    }
}
