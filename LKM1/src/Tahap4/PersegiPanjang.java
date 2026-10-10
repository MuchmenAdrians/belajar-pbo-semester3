package Tahap4;

class PersegiPanjang
{
    double panjang;
    double lebar;

    PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas()
    {
        return panjang * lebar;
    }
    double hitungKeliling()
    {
        return 2 * (panjang + lebar);
    }
}
