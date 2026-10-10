package Tahap3;

public class Tunai extends Pembayaran {
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran tunai diproses...");
    }
}
