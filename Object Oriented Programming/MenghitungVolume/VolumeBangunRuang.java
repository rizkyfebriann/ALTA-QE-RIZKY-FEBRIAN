package MenghitungVolume;
import java.util.Scanner;

public class VolumeBangunRuang {
    public static void VolumeKubus(){
        Scanner input = new Scanner (System.in);
        int s, volumekubus;
        System.out.println("Menghitung Volume Kubus");
        System.out.print("Masukkan Panjang Sisi : ");
        s = input.nextInt();
        volumekubus = s * s * s;
        System.out.println("Volume kubus nya adalah : " + volumekubus);
    }
    public static void VolumeBalok() {
        Scanner input = new Scanner(System.in);
        int p, l, t, volumebalok;
        System.out.println("Menghitung Volume Balok");
        System.out.print("Masukkan Panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        t = input.nextInt();
        volumebalok = p * l * t;
        System.out.println("Volume balok nya adalah : " + volumebalok);
    }
    public static void VolumeTabung() {
        Scanner input = new Scanner(System.in);
        double r,
        phi=3.14;
        int t;
        double volumetabung;
        System.out.println("Menghitung Volume Tabung");
        System.out.print("Masukkan R / Jari-Jari : ");
        r = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        t = input.nextInt();
        volumetabung = phi * (r * r) * t;
        System.out.println("Volume balok nya adalah : " + volumetabung);
    }
}
