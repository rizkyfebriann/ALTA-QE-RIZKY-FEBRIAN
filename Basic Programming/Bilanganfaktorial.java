import java.util.Scanner;

public class Bilanganfaktorial {
    public static void main(String[] args) {
        int bilangan;

        //Process : Your Solution Code is Here
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka");
        bilangan = input.nextInt(); //inputan bilangan
        System.out.print("Faktor dari " + bilangan + " adalah : \n"); //info faktor dari bilangan yg kita inputkan
        for (int i=1;i <= bilangan;i++) //pengulangan dari i=1 sampai bilangan (yg diinputkan)
        {
            if (bilangan%i == 0) //rumus faktorial
            {
                System.out.println(i + ""); //angka yg merupakan faktorial dari bilangan tsb akan ditampilkan
            }
        }

    }
}
