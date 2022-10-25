package dayA;

import java.util.Scanner;

public class methoSoru2 {
    public static void main(String[] args) {

//Verilen 2 stringi parametre olarak kabul edip bu iki stringi aralarinda bir bosluk olan tek bir string olarak main methoda donduren method olusturun.

        String str1="ice dogru derinlesmeden";
       String str2="disa dogru acilim olmaz.";
        System.out.println(birlestirMethodu(str1, str2));

    }

public static String birlestirMethodu(String str1, String str2){
return str1+ " "+str2;

}




}
