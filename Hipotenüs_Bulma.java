import java.util.Scanner;


public class Hipotenüs_Bulma {

    public static void main(String []Args){

        Scanner input = new Scanner(System.in);

        int a,b,c;


        System.out.println("A kenarını giriniz : ");
        a = input.nextInt();

        System.out.println("B kenarını giriniz : ");
        b = input.nextInt();

        System.out.println("C kenarını giriniz : ");
        c = input.nextInt();

        int çevre = (a+b+c) / 2;
        int alan = çevre * (çevre - a) * (çevre-b) * (çevre -c);
        System.out.println("Alan =" + Math.sqrt(alan));




    }

}
