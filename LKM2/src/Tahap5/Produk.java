package Tahap5;

class Produk {
    String namaProduk;
    double harga;
    int stok;

    // Constructor
    Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Menampilkan info produk
    void tampilInfo() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        : " + stok);
    }

    // Mengurangi stok saat ada pembelian
    void beliProduk(int jumlah) {
        if (jumlah <= stok) {
            stok = stok - jumlah;
            System.out.println("Berhasil membeli " + jumlah + " " + namaProduk);
            System.out.println("Total bayar : Rp" + (harga * jumlah));
            System.out.println("Sisa stok   : " + stok);
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }
}