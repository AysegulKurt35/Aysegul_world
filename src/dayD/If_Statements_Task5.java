package dayD;

import java.util.Scanner;

public class If_Statements_Task5 {
    public static void main(String[] args) {

//        Soru 5-Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char krk =scan.next().charAt(0);
        if (krk >= 'a' && krk <= 'z') { //kucuk harf girildi demektir
            System.out.println((char)(krk-32));//"32"ASCI tablosunda buyuk harf ile kucuk harfin arasindaki fark
        }else
            System.out.println(krk);





    }




}
