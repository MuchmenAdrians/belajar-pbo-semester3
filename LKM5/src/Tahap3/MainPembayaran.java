package Tahap3;

public class MainPembayaran {
    public static void main(String[] args) {
        // Polymorphism: satu array bertipe Pembayaran, isinya bermacam-macam objek
        Pembayaran[] daftar = new Pembayaran[4];
        daftar[0] = new Pembayaran();
        daftar[1] = new Tunai();
        daftar[2] = new KartuKredit();
        daftar[3] = new EWallet();

        System.out.println("=== Overriding (Polymorphism) ===");
        for (Pembayaran p : daftar) {
            p.prosesPembayaran();
        }

        System.out.println("\n=== Overloading (parameter jumlah uang) ===");
        Pembayaran tunai = new Tunai();
        tunai.prosesPembayaran(50000);      // memanggil versi int
        tunai.prosesPembayaran(75000.50);   // memanggil versi double
    }
}
