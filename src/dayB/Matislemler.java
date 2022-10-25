package dayB;

public class Matislemler {
    public static void main(String[] args) {
//Kullanicidan 4 basamakli pozoitif bir tamsayi alip rakamlar toplamini bulalim.

        int input=1453;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

//birler basamagini al
 birlerBasamagi=input%10;//3

//2)birler basamagini rakamlar toplamina ekle
rakamlarToplami=rakamlarToplami+birlerBasamagi;//3

//3)birler basamagindan kurtul
  input=input/10;

        birlerBasamagi=input%10;//3
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//3
        input=input/10;

        birlerBasamagi=input%10;//3
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//3
        input=input/10;

        birlerBasamagi=input%10;//3
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//3
        input=input/10;

        System.out.println("Verilen sayilarin rakamlari toplami="+rakamlarToplami);
    }

}
