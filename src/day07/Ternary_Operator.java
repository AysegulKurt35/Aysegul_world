package day07;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {

//Kullanicidan bir sayi alin
//sayi pozitif ise 2 katini
//sayi pozitif degilse sayiya 10 ekleyin yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi aliniz.");
        double sayi = scan.nextDouble();
        if (sayi > 0) {
            System.out.println(sayi * 2);
        } else {
            System.out.println(sayi + 10);
        }
        System.out.println(sayi>0 ? sayi*2: sayi+10);
    }
}
