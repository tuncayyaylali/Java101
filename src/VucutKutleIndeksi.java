import java.util.Scanner;

public class VucutKutleIndeksi {
    public static void main(String[] args) {
        int agirlik;
        double boy, VKI;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        agirlik = input.nextInt();

        VKI = agirlik / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + VKI);
    }
}
