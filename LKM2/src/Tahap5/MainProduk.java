package Tahap5;
public class MainProduk {
    public static void main(String[] args) {
        // Buat 2 object produk
        Produk p1 = new Produk("Keyboard Mechanical", 350000, 10);
        Produk p2 = new Produk("Mouse Wireless", 125000, 3);

        // Info awal
        System.out.println("=== INFO AWAL ===");
        p1.tampilInfo();
        System.out.println();
        p2.tampilInfo();

        // Simulasi pembelian
        System.out.println();
        System.out.println("=== SIMULASI PEMBELIAN ===");
        System.out.println("Beli Keyboard 4 buah:");
        p1.beliProduk(4);
        System.out.println();
        System.out.println("Beli Mouse 5 buah (stok cuma 3):");
        p2.beliProduk(5);

        // Info akhir
        System.out.println();
        System.out.println("=== INFO AKHIR ===");
        p1.tampilInfo();
        System.out.println();
        p2.tampilInfo();
    }
}