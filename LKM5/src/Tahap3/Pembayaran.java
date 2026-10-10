package Tahap3;

public class Pembayaran {
    // Method yang nanti di-override oleh subclass
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran umum...");
    }

    // Overloading: menerima jumlah uang bertipe int
    public void prosesPembayaran(int jumlah) {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah + " (tipe int)");
    }

    // Overloading: menerima jumlah uang bertipe double
    public void prosesPembayaran(double jumlah) {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah + " (tipe double)");
    }
}
