package Tahap5;

public class PegawaiTetap extends Pegawai implements Tunjangan {

    public PegawaiTetap(String nama, double gaji, String jabatan) {
        super(nama, gaji, jabatan);
    }

    @Override
    public double hitungTunjangan() {
        return getGaji() * 0.2;
    }

    @Override
    public double hitungGajiTotal() {
        return getGaji() + hitungTunjangan();
    }
}
