package Tahap1;

public class DemoPolymorphism {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.bersuara(); // Output: Meong...
        h2.bersuara(); // Output: Guk guk...
    }
}
