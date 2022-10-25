package dayD;

public class If_Else_Statements {
    public static void main(String[] args) {

//If else statement de {} kullanmazsak
// hem if body si hem de else body si icin sadece "1"harf kabul eder.
// Sonraki satirlar if else ile iliskilendirilmez.Her durum da calisir.


        double not = 50.3;
        if (not >= 50) {
            System.out.println("Sinifi Gectin");
        } else {
            System.out.println("Maalesef kaldin.");

             not = 46;

            if (not>= 50) {
                System.out.println("Sinifi gectin");
                System.out.println("bu yaz iyisin");
            } else {
                System.out.println("Bu dersten kaldin");
                System.out.println("Yaz okuluna bekleriz.");

            }
        }
    }
        }




