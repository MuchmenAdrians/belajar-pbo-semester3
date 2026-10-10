package Tahap1;

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Tom";
        k.makan();   // diwarisi dari Hewan
        k.suara();   // milik Kucing
    }
}
