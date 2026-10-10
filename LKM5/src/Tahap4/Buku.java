package Tahap4;

class Buku {
    String judul;

    public Buku(String judul)
    {
        this.judul = judul;
    }
    public void info()
    {
        System.out.println("Judul Buku: "+judul);
    }
    public void info(int TahunTerbit)
    {
        System.out.println("Judul Buku: "+ judul + "Tahun terbit: "+TahunTerbit);
    }
    public void info(String penulis)
    {
        System.out.println("Judul Buku: "+ judul+ "Penulis: "+ penulis);
    }

}

