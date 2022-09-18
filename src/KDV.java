import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        int kdvsizTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen KDV' siz Tutarı Giriniz: ");
        kdvsizTutar = input.nextInt();
        float kdv;
        kdv = kdvsizTutar<=1000&&kdvsizTutar>=0 ? 18:8;
        float kdvliTutar = kdvsizTutar * (1+(kdv/100));
        System.out.println("KDV' li Tutar: " + kdvliTutar);
    }
}
