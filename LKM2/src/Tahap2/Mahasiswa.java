package Tahap2;

class Mahasiswa
{
    String nama;
    String nim;
    double ipk;

    // Constructor
    Mahasiswa(String nama, String nim, double ipk)
    {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    void tampilData()
    {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
}