import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        int karmut, kelma, kdomates, kmuz, kpatlican;
        double barmut = 2.14, belma = 3.67, bdomates = 1.11, bmuz = 0.95, bpatlican = 5.0, toplamtutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo? :");
        karmut = input.nextInt();

        System.out.println("Elma Kaç Kilo? :");
        kelma = input.nextInt();

        System.out.println("Domates Kaç Kilo? :");
        kdomates = input.nextInt();

        System.out.println("Muz Kaç Kilo? :");
        kmuz = input.nextInt();

        System.out.println("Patlıcan Kaç Kilo? :");
        kpatlican = input.nextInt();

        toplamtutar = (karmut*barmut) + (kelma*belma) + (kdomates*bdomates) + (kmuz*bmuz) + (kpatlican*bpatlican);
        System.out.println("Toplam Tutar : " + toplamtutar);
    }
}
