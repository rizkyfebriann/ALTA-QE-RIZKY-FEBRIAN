
public class Cekpalindrome {
    private static boolean palindrome(String value) {
        String rev = ""; //membuat tempat dari variable baru dari kebalikan value
        int length = value.length(); //melihat panjang data dari value yg ada
        boolean palindrome = false; //default nya bukan palindrome semua / false

        for (int i = (length - 1); i >= 0; i--) { // perulangan cek huruf dari belakang pada value yg ada
            rev = rev + value.charAt(i); // hasil dari perulangan dimasukkan ke dalam rev
        }
        palindrome = value.equals(rev); //palindrome is true kalau value nya sama dg rev

        return palindrome; //mengembalikan nilai palindrome yg dihasilkan
    }

    public static void main(String[] args){
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu kupu"));
        System.out.println(palindrome("lion"));
        System.out.println(palindrome("malam")); //saya tambahkan 1 value lain buat test
    }
}