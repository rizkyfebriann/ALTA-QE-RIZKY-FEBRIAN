import java.util.Scanner; //menyalakan fitur scanner

public class Menghitungmean {
    public static void main(String[] args){

        int array[], i, n; //menentukan variable array, i, n dalam bentuk integer
        array = new int[10]; //buat atur batasan inputan array
        float rata, total=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen array: "); //perintah untuk input elemen array nya
        n = scan.nextInt(); // inputan n akan diubah dalam bentuk variable n

        for(i = 1; i <= n; i++){ //pengulangan sebanyak n
            System.out.print("Nilai Ke-"+ i +" : ");
            array[i] = scan.nextInt(); //menginputkan nilai2 sebanyak n kali menjadi bentuk array
            total = total + array[i]; //menghitung total=0 + total jumlah dari value array yg diinput
        }
        rata = total/n; //rumus rata2
        System.out.println("Nilai rata-rata nya adalah : " + rata);
    }
}