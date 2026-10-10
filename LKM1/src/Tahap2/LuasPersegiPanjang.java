package Tahap2;

import java.util.Scanner;

public class LuasPersegiPanjang
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukan lebar: ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas = " + luas);
        input.close();
    }
}
