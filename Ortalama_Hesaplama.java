import java.util.Scanner;

public class Ortalama_Hesaplama {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int mat,fiz,kimya;



        System.out.println("mat not giriniz : ");
        mat = input.nextInt();
        System.out.println("fiz not giriniz : ");
        fiz = input.nextInt();
        System.out.println("kimya not giriniz : ");
        kimya = input.nextInt();


        int ort = (mat + fiz + kimya ) /3;
        System.out.println("ort : " +ort);
        System.out.println(ort > 60 ? "sınıfı geçti" : "sınıfta kaldı");
    }
}
