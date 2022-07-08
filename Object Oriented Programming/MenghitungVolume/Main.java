package MenghitungVolume;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        VolumeBangunRuang volume = new VolumeBangunRuang();
        Scanner input = new Scanner(System.in);
        double a;
        System.out.println("Menghitung Volume Bangun Ruang");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");

        System.out.println("Masukkan Pilihan Anda Dibawah Ini : ");
        a = input.nextDouble();
        int masukan = 0;

        if (a == 1) {
            volume.VolumeKubus();
        }
        else if (a == 2){
            volume.VolumeBalok();
        }
        else if (a == 3){
            volume.VolumeTabung();
        }
        else {
            System.out.println ("Your choices is not in the list. Please try again");
        }
    }
}
