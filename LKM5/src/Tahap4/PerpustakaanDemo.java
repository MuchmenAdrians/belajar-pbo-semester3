package Tahap4;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        // Membuat array berisi objek Buku (polymorphism)
        Buku[] koleksi = new Buku[3];
        koleksi[0] = new BukuFiksi("Harry Potter");
        koleksi[1] = new BukuNonFiksi("Sejarah Indonesia");
        koleksi[2] = new Majalah("National Geographic");

        // Menampilkan info dari setiap buku (runtime polymorphism)
        System.out.println("=== Informasi Koleksi Buku ===");
        for (Buku b : koleksi) {
            b.info(); // memanggil method override sesuai jenis objek
        }

        System.out.println("\n=== Contoh Overloading ===");
        Buku buku1 = new Buku("Algoritma Java");
        buku1.info();                    // Versi default
        buku1.info(2020);                // Versi overloading dengan tahun
        buku1.info("Budi Santoso");      // Versi overloading dengan penulis
    }
}
