package MenghitungLuasdanKeliling;

import java.util.Scanner;

public class RumusLuas {
    public static void LuasPersegi(){
        Scanner input = new Scanner (System.in);
        double s, luaspersegi;
        System.out.println("Menghitung Luas Persegi");
        System.out.print("Masukkan Panjang Sisi : ");
        s = input.nextDouble();
        luaspersegi = s * s;
        System.out.println("Luas nya adalah : " + luaspersegi);
    }
    public static void LuasSegitiga(){
        Scanner input = new Scanner (System.in);
        double alas, tinggi, luassegitiga;
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukkan Panjang Alas : ");
        alas = input.nextDouble();
        System.out.print("Masukkan Panjang Tinggi : ");
        tinggi = input.nextDouble();
        luassegitiga = ((alas * tinggi)/2);
        System.out.println("Luas nya adalah : " + luassegitiga);
    }
    public static void LuasPersegiPanjang(){
        Scanner input = new Scanner (System.in);
        double panjang, lebar, luaspersegipanjang;
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Masukkan Panjang : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        lebar = input.nextDouble();
        luaspersegipanjang = panjang * lebar;
        System.out.println("Luas nya adalah : " + luaspersegipanjang);
    }
}
