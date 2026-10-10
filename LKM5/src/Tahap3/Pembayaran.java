package Tahap3;

class Pembayaran {
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran umum...");
    }

    // Overloading dengan parameter int
    public void prosesPembayaran(int jumlah) {
        System.out.println("Pembayaran sebesar Rp" + jumlah);
    }

    // Overloading dengan parameter double
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran sebesar Rp" + jumlah);
    }
}