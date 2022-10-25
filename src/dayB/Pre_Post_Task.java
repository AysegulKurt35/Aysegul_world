package dayB;

public class Pre_Post_Task {
    public static void main(String[] args) {
     int x=20;
     int y=x++;
     int z=++y;
     System.out.println("x=" + x +" ,y=" + y +",z="+z);

     int a=30;
        System.out.println(a++);//once islem sonra artir
        System.out.println(--a);//once azalt sonra islem
        System.out.println(a--);//once islem sonra azalt
        System.out.println(a);




    }
}
