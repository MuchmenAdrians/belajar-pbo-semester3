package Tahap1;

class Mahasiswa {
    private String nama;
    private int umur;

    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    // Setter
    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    public int getUmur() {
        return umur;
    }
}
