package Tahap4;

public class Segitiga {

    double alas;
    double tinggi;
    double sisi1;
    double sisi2;
    double sisi3;

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}