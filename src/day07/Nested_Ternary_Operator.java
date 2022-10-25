package day07;

public class Nested_Ternary_Operator {
    public static void main(String[] args) {


        //   Kullanicidon bir tamsayi oldn.

        //   Sayi pozitifse, cift sayi veya cift sayi degil, seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse 3 basamakli veya 3 bosomokli degil seceneklerinden uygun olani yazdirin

        int sayi = 21;
        if (sayi > 0) {

//cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin.

            System.out.println(sayi % 2 == 0 ? "Cift sayi" : "cift sayi degil");
        } else {

        }
    }
}