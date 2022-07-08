package KalkulatorSederhanaNew;
import java.util.Scanner;

public class Pembagian extends Kalkulator {
    public static void pembagian() {
        Scanner input = new Scanner (System.in);
        System.out.println("Pembagian");
        System.out.print("Masukkan Angka 1 : ");
        angka1 = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        angka2 = input.nextInt();
        hasil = angka1 / angka2;
        System.out.println("Hasil pembagian nya adalah :" + hasil);
    }
}
