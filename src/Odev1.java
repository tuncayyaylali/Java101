import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        float matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextFloat();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextFloat();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextFloat();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextFloat();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextFloat();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextFloat();

        float ortalamaNot = (matematik + fizik + kimya  + turkce + tarih + muzik) / 6;
        String dersGecmeDurumu = ortalamaNot >= 60 ? "Geçti": "Kaldı";
        System.out.println(dersGecmeDurumu);
    }
}
