package MenghitungLuasdanKeliling;

import java.util.Scanner;

public class RumusKeliling {
    public static void KelilingPersegi(){ //fungsi untuk menghitung keliling persegi
        Scanner input = new Scanner (System.in);
        double s, kelilingpersegi;
        System.out.println("Menghitung Keliling Persegi");
        System.out.print("Masukkan Panjang Sisi : ");
        s = input.nextDouble();
        kelilingpersegi = 4 * s; //rumus keliling persegi
        System.out.println("Keliling nya adalah : " + kelilingpersegi);
    }
    public static void KelilingSegitiga(){
        Scanner input = new Scanner (System.in);
        double alas, tinggi, kelilingsegitiga;
        System.out.println("Menghitung Keliling Segitiga");
        System.out.print("Masukkan Panjang Alas : ");
        alas = input.nextDouble();
        System.out.print("Masukkan Panjang Tinggi : ");
        tinggi = input.nextDouble();
        kelilingsegitiga = 3 * tinggi;
        System.out.println("Keliling nya adalah : " + kelilingsegitiga);
    }
    public static void KelilingPersegiPanjang(){
        Scanner input = new Scanner (System.in);
        double panjang, lebar, kelilingpersegipanjang;
        System.out.println("Menghitung Keliling Persegi Panjang");
        System.out.print("Masukkan Panjang : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        lebar = input.nextDouble();
        kelilingpersegipanjang = 2 * panjang + 2 * lebar;
        System.out.println("Keliling nya adalah : " + kelilingpersegipanjang);
    }
}
