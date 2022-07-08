import java.util.Scanner;
public class Bilanganprima {

    private static int primeNumber (int number){
        return number; //mengembalikan value number yg diinputkan
    }
        public static void main (String[] args) {
            Scanner masukkan = new Scanner(System.in);

            System.out.print("Masukkan sebuah bilangan : ");
            int number = masukkan.nextInt();
            boolean primeNumber = true; //defaultnya pengecekan primeNumber true (bilangan prima)
            for (int i = 2; i < number; i++) { //pengulangan sebanyak number, pembagi nya 2
                if (number % i == 0) {
                    primeNumber = false;
                    break;
                    //ini perhitungan untuk mengambil nilai bukan prima
                    //apabila number % 1 == 0 , maka primeNumber nya false (bukan prima)
                }
            }
            if (primeNumber == true) { //kalau true, output nya dibawah ini
                System.out.println(number + " Adalah bilangan prima");
            }
            else { //kalau false, output nya dibawah ini
                System.out.println(number + " Adalah bukan bilangan prima");
            }
        }
}