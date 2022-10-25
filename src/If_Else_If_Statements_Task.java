import java.util.Scanner;

public class If_Else_If_Statements_Task {
    public static void main(String[] args){
// kullanicidan bir tam sayi alin
// sayi negatif ise "gecersiz sayi"
// tek basamakli ise "rakam"
// iki basamakli ise "iki basamakli sayi"
// bunun disindaki sayilar icin "buyuk sayi" yazdirin

    int sayi= 2;

if (sayi<0) {

        System.out.println("gecersiz savi");

    }else if(sayi<10){

        System.out.println("rakam");

    } else if (sayi<100) {

        System.out.println("iki basamakli sayi");

    }else

        System.out.println("buyuk sayi");

    }
    }
