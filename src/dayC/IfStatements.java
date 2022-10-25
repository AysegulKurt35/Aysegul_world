package dayC;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class IfStatements {
    public static void main(String[] args) {

//Kullanicidan iki tam sayi sayi alin
// eger birinci sayi 100 den buyukse "ilk sayi 100 den buyuk "yazdirin
//Eger ikinci sayi ciftse "Ikinci sayi cift"yazdirin
//Eger ilk sayi ikinci sayidan buyukse "ilk sayi daha buyuk" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi = scan.nextInt();
        int ikinciSayi = scan.nextInt();

        // eger birinci sayi 100 den buyukse "ilk sayi 100 den buyuk "yazdirin
        if (ilkSayi > 100) {
            System.out.println("ilk sayi 100 den buyuk");
        }
//Eger ikinci sayi ciftse "Ikinci sayi cift"yazdirin.
        if (ikinciSayi % 2 == 0) {
            System.out.println("ikinci sayi cift");
        }
        //Eger ilk sayi ikinci sayidan buyukse "ilk sayi daha buyuk" yazdirin.
        if (ilkSayi > ikinciSayi) {
            System.out.println("ilk sayi daha buyuk");

        }
    }
}