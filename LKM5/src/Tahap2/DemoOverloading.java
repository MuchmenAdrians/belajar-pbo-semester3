package Tahap2;

public class DemoOverloading {
    public static void main(String[] args) {
        Matematika m = new Matematika();

        System.out.println(m.tambah(5, 10));     // 15
        System.out.println(m.tambah(5.5, 2.3));  // 7.8
        System.out.println(m.tambah(1, 2, 3));   // 6
    }
}
