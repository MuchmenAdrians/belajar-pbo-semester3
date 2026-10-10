package Tahap2;

class Manager extends Pegawai {
    String departemen;

    Manager(String nama, int gaji, String departemen) {
        super(nama, gaji); // memanggil constructor superclass
        this.departemen = departemen;
    }

    void infoManager() {
        info();
        System.out.println("Departemen: " + departemen);
    }
}
