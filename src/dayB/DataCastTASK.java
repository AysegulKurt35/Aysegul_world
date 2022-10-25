package dayB;

import java.util.Scanner;

public class DataCastTASK {
    public static void main(String[] args) {

//kullanicidan iki integer deger alip bunlari birbirine bolun ve sonucu double olarak yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi1 tamsayi giriniz.");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen sayi2 tamsayi giriniz.");
        int sayi2= scan.nextInt();
        System.out.println(sayi1/sayi2);
         double dogruSonuc=(double)sayi1/sayi2;
        System.out.println(dogruSonuc);
    }
}
