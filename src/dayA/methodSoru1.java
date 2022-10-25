package dayA;

import java.util.Scanner;

public class methodSoru1 {
    public static void main(String[] args) {



   //     1-Main method kullanicidan iki sayi alin.Bu iki sayiyi parametre olarak kabul edip carpimlarini bize donduren bir method olusturun.

    Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 sayi giriniz.");
        double sayi1= scan.nextDouble();//5
        double sayi2= scan.nextDouble();//3

        System.out.println(carpimMethodu(sayi1,sayi2));


    }

public static double carpimMethodu(double sayi1, double sayi2 ){
    return sayi1*sayi2;



}
}
