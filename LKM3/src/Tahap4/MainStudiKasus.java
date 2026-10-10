package Tahap4;

// Program utama
public class MainStudiKasus {
    public static void main(String[] args) {
        // Membuat transaksi belanja
        TransaksiBelanja transaksi = new TransaksiBelanja("TRX001", 500000);

        // Menampilkan informasi transaksi
        transaksi.tampilkanInfo();
        double total = transaksi.hitungTotal();
        System.out.println("Total setelah pajak: Rp" + total);
        System.out.println();

        // Membayar dengan Kartu Kredit
        Pembayaran kartuKredit = new KartuKredit("Adrian", "1234-5678-9012-3456");
        kartuKredit.prosesPembayaran(total);
        System.out.println();

        // Membayar dengan Dompet Digital
        Pembayaran dompetDigital = new DompetDigital("Adrian_wallet");
        dompetDigital.prosesPembayaran(total);
    }
}
