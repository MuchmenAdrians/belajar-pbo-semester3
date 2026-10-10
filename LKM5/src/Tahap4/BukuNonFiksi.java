package Tahap4;

public class BukuNonFiksi extends Buku {
    public BukuNonFiksi(String judul) {
        super(judul);
    }

    @Override
    public void info() {
        System.out.println("Buku Non-Fiksi - Judul: " + getJudul());
    }
}
