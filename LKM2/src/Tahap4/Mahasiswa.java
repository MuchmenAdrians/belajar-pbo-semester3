package Tahap4;

class Mahasiswa {
    // Atribut dibuat private
    private String nama;
    private String nim;
    private double ipk;

    // Constructor
    Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        setIpk(ipk); // lewat setter supaya ikut divalidasi
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid, harus antara 0.0 sampai 4.0");
        }
    }

    void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }

    void cekKelulusan() {
        if (ipk >= 3.0) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Perlu perbaikan");
        }
    }
}