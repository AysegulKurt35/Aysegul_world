import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class If_Else_If_Statements_Task1 {
    public static void main(String[] args) {

//        If Else Statements Sorular

//        Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.



        char cinsiyet = 'E';
        int yas = 60;
        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Emekli olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olabilmek icin daha" + (65 - yas) + "sene calismalisin");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Emekli olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olabilmek icin daha" + (60 - yas) + "sene calismalisin");
        }


//





        
    }
}
