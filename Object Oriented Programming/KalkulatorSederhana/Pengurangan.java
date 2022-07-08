package KalkulatorSederhanaNew;
import java.util.Scanner;

public class Pengurangan extends Kalkulator {
    public static void pengurangan() {
        Scanner input = new Scanner (System.in);
        System.out.println("Pengurangan");
        System.out.print("Masukkan Angka 1 : ");
        angka1 = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        angka2 = input.nextInt();
        hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan nya adalah :" + hasil);
    }
}
