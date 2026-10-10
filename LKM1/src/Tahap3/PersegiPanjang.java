package Tahap3;

class PersegiPanjang
{
    int panjang;
    int lebar;

    PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    int hitungLuas()
    {
        return panjang * lebar;
    }

    int hitungKeliling()
    {
        return 2 * (panjang + lebar);
    }
}
