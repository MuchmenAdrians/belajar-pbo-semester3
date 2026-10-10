package Tahap4;

public abstract class Transaksi {
    protected String idTransaksi;
    protected double jumlah;

    public Transaksi(String idTransaksi, double jumlah) {
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
    }
    
    public abstract double hitungTotal();
    
    public void tampilkanInfo(){
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Jumlah: Rp" + jumlah);
    }
}
