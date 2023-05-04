import java.util.Scanner;

public class KDV_Hesaplama {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       double para;
       para = input.nextInt();

       double KDVTutarı = (para >= 1000) ? 8:18;

       double KDV = (para /100) * KDVTutarı;

       double paraKDV = para + KDV;

       System.out.println("KDV'siz Fiyat : " + para);
       System.out.println("KDV'li Fiyat : " + paraKDV);
       System.out.println("KDV tutarı : " + KDV);
    }

}
