package PerhitunganOngkosKirim;
import java.util.Scanner;

public class Volume {
    public static void Volumetrik() {
        Scanner input = new Scanner(System.in);
        double p;
        double l;
        double t;
        double volumetrik;
        System.out.println("Menghitung Volumetrik");
        System.out.print("Masukkan Panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        l = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        t = input.nextDouble();
        volumetrik = (p * l * t) / 5000;
        System.out.println("Volumetrik nya adalah : " + volumetrik);
    }
}


