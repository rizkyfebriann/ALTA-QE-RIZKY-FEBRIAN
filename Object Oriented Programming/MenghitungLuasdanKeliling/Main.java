package MenghitungLuasdanKeliling;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        RumusLuas luas = new RumusLuas();
        RumusKeliling keliling = new RumusKeliling();
        Scanner input = new Scanner (System.in);
        double a;
        System.out.println("Menghitung Luas dan Keliling Bangun Datar");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi Panjang");

        System.out.println("Masukkan Pilihan Anda Dibawah Ini : "); //pilihan bangun datar yang mana
        a = input.nextDouble();
        int masukan = 0;

        if (a==1){
            RumusLuas.LuasPersegi();
            RumusKeliling.KelilingPersegi();
        } else if (a==2){
            RumusLuas.LuasSegitiga();
            RumusKeliling.KelilingSegitiga();
        } else if (a==3){
            RumusLuas.LuasPersegiPanjang();
            RumusKeliling.KelilingPersegiPanjang();
        } else {
            System.out.println ("Pilihan anda salah. Harap pilih yang ada saja"); //selain 1, 2, 3 tidak valid
        }
    }
}
