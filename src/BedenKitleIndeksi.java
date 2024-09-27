import java.util.Scanner;

public class BedenKitleIndeksi {
    public static void main(String[] args){
        //Beden Kitle İndeksi = kilo/boy(m)*boy(m)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz..:");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu giriniz(ör:1.63)..:");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle Indeksiniz..:" + bki);


    }
}
