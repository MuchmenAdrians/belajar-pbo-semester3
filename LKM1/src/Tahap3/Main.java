package Tahap3;

public class Main
{
    public static void main(String[] args)
    {
        PersegiPanjang pp1 = new PersegiPanjang(10,5);
        PersegiPanjang pp2 = new PersegiPanjang(7,4);

        System.out.println("Luas pp1 = "+ pp1.hitungLuas());
        System.out.println("Keliling pp1 = "+ pp1.hitungKeliling());

        System.out.println("Luas pp2 = "+ pp2.hitungLuas());
        System.out.println("Keliling pp2 = "+ pp2.hitungKeliling());
    }

}
