package Tahap4;

class Person {
    public String nama;        // Dapat diakses di mana saja
    protected String alamat;   // Hanya bisa diakses di package atau subclass
    private int umur;          // Hanya bisa diakses di dalam class Person

    // Setter dan Getter untuk atribut private
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void info() {
        System.out.println("Nama: " + nama + ", Alamat: " + alamat + ", Umur: " + umur);
    }
}
