package Tahap1;

public class MainMahasiswa
{
    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa("Adrian", 19);
        System.out.println("Nama Mahasiswa = " + mhs.getNama());
        System.out.println("Umur Mahasiswa (Now) = " + mhs.getUmur());
        mhs.setUmur(20);
        System.out.println("Umur Mahasiswa (Update) = " + mhs.getUmur());
    }
}
