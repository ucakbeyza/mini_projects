import java.util.Scanner;
public class YakitTutari {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Aracınız km de kaç kuruş yakıyor(ör:0.32)..:");
        double kurus = scanner.nextDouble();

        System.out.print("Aracınızla kaç km gittiniz..:");
        int km = scanner.nextInt();

        System.out.println("Toplam ödemeniz gereken tutar..:" + (kurus * km)+"tl dir...");


    }
}
