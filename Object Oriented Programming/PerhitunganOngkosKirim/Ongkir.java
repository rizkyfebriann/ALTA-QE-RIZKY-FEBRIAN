package PerhitunganOngkosKirim;
import java.util.Scanner;

public class Ongkir extends Volume {
    public static void Ongkir() {
        Scanner input = new Scanner (System.in);
        int Ongkir;
        double volumetrik;
        System.out.println("Menghitung Ongkir");
        System.out.print("Masukkan Volumetrik : ");
        volumetrik = input.nextDouble();
        if (volumetrik <= 50){
            Ongkir = 5000;
        } else {
            Ongkir = 10000;
        }
        System.out.println("Ongkir nya adalah : " + Ongkir);
    }
}
