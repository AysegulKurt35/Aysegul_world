package day07;

public class Ternary_Operatot {
    public static void main(String[] args) {

        int a = 5;


//        Ternary operatoru tek basing kullanilamaz ternary bize bir sonuc uretir
        //       bu sonucu ya direk yazdirmali veya bir variable'a atamaliyiz

        String sonuc = a % 2 == 0 ? "cift sayi" : "tek sayi";

        //       ternary'nin sonucunu bir variable'a atayacaksak true ve false durumlarinda uretilecek sonucun guni data turune uygun olmosi gerekir.
        //       aksi halde CTE olusur

        //      ama ternary'i sout icinde kullanirsak sonuclarin data turunun pyni olmasi surt olmaz */

        String sonuc2 = a > 10 ? "buyuk sayi" : ""+2*a;   // CTE vermemesi String e cevirdik.

        System.out.println(a > 10 ? "buyuk sayi" : 2 * a);





    }
}
