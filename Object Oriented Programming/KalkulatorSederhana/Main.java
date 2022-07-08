package KalkulatorSederhanaNew;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Kalkulator kalkulator = new Kalkulator();
        Penjumlahan penjumlahan = new Penjumlahan();
        Pengurangan pengurangan = new Pengurangan();
        Perkalian perkalian = new Perkalian();
        Pembagian pembagian = new Pembagian();
        Scanner input = new Scanner (System.in);
        int a;
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.println("Masukkan Pilihan Anda Dibawah Ini : ");
        a = input.nextInt();
        int masukan = 0;

        switch(a){
            case 1 :
                Penjumlahan.penjumlahan();
                break;
            case 2 :
                Pengurangan.pengurangan();
                break;
            case 3 :
                Perkalian.perkalian();
                break;
            case 4 :
                Pembagian.pembagian();
                break;
            default :
                System.out.println("Maaf. pilihan anda salah");
                break;
        }
    }
}
