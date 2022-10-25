package dayB;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {

 //Kullanicidan iki sayi alin.ilk sayiyi ikinci sayiya bolun.
 //ve bolum isleminin sonucunun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz.");
         double sayi1= scan.nextDouble();
         double sayi2= scan.nextDouble();
        System.out.println(sayi1 / sayi2);
         int bolmeSonucuTamsayi= (int)(sayi1/sayi2);
        System.out.println(bolmeSonucuTamsayi);
    }

}
