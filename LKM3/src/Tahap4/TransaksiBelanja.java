package Tahap4;

// Implementasi konkret dari Transaksi
class TransaksiBelanja extends Transaksi
{
    private double pajak = 0.1; // 10% pajak

    public TransaksiBelanja(String idTransaksi, double jumlah)
    {
        super(idTransaksi, jumlah);
    }

    @Override
    public double hitungTotal()
    {
        return jumlah + (jumlah * pajak);
    }
}
