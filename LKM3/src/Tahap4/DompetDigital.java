package Tahap4;

// Implementasi pembayaran dengan Dompet Digital
class DompetDigital implements Pembayaran {
    private String namaAkun;

    public DompetDigital(String namaAkun) {
        this.namaAkun = namaAkun;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah +
                " menggunakan Dompet Digital akun: " + namaAkun);
    }
}
