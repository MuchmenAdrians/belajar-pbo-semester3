package Tahap4;

// Implementasi pembayaran dengan Kartu Kredit
class KartuKredit implements Pembayaran {
    private String namaPemilik;
    private String nomorKartu;

    public KartuKredit(String namaPemilik, String nomorKartu) {
        this.namaPemilik = namaPemilik;
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah +
                " menggunakan Kartu Kredit milik " + namaPemilik);
    }
}