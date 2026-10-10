package Tahap4;

class BukuFiksi extends Buku {
    public BukuFiksi(String judul){
        super(judul);
    }
    @Override
    public void info()
    {
        System.out.println("Buku Fiksi - Judul: "+ judul);
    }
}
