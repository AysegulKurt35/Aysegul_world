package day06;

public class Nested_If_Statements {
    public static void main(String[] args) {

        //nested_if_else seklinde kullanim icin once ana degiskeni secip ona gore ana yapiyi olusturalim.

        //       Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.

//cinsiyet ana degisken olsun
        char cinsiyet = 'K';
        int yas = 56;
        if (cinsiyet == 'k' || cinsiyet == 'K') { //giris yapilan deger bir kadina ait demektir.

            if (yas > 15){
                System.out.println("Hatali yas girisi");
            }else if (yas > 60){
                    System.out.println("emekli olmak icin" + (60 - yas) + "sene daha calismalisin");

                } else {
                    System.out.println("Emekli olabilirsin");
                    }


        } else if (cinsiyet == 'e' || cinsiyet == 'E') { //giris yapilan deger bir erkege ait
            if (yas > 15){
                System.out.println("Hatali yas girisi");
            }else if (yas > 60){
                System.out.println("emekli olmak icin" + (60 - yas) + "sene daha calismalisin");

            } else {
                System.out.println("Emekli olabilirsin");
            }
            } else {
                System.out.println("Yanlis cinsiyet girisi");

            }
        }
    }