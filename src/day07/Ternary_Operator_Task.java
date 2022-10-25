package day07;

public class Ternary_Operator_Task {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";

//Verilen 2 metin birbiri ile ayni ise metinler ayni,farkli ise metinler farkli yazdirin.

        if (str1.equals(str2)) {
            System.out.println("Metinler ayni");

        } else {
            System.out.println("Metinler farkli");
        }

        System.out.println(str1.equals(str2)? "metinler ayni":"metinler farkli");



    }



}
