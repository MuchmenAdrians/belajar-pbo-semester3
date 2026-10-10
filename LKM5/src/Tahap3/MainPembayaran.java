package Tahap3;

public class MainPembayaran {

    public static void main(String[] args) {

        Pembayaran tunai = new Tunai();
        Pembayaran kartu = new KartuKredit();
        Pembayaran ewallet = new EWallet();

        tunai.prosesPembayaran();
        kartu.prosesPembayaran();
        ewallet.prosesPembayaran();

        System.out.println();

        Pembayaran pembayaran = new Pembayaran();

        pembayaran.prosesPembayaran(50000);
        pembayaran.prosesPembayaran(75000.50);
    }
}
