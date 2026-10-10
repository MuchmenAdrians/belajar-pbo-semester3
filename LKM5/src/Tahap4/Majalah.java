package Tahap4;

public class Majalah extends Buku {
    public Majalah(String judul) {
        super(judul);
    }

    @Override
    public void info() {
        System.out.println("Majalah - Judul: " + getJudul());
    }
}
