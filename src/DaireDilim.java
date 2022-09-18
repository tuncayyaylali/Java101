import java.util.Scanner;

public class DaireDilim {
    public static void main(String[] args) {
        int yaricap, aci;
        double pi = 3.14, alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Giriniz: ");
        yaricap = input.nextInt();

        System.out.println("Daire Diliminin Açısını Giriniz: ");
        aci = input.nextInt();

        alan = pi * yaricap * yaricap * aci / 360;
        System.out.println(alan);
    }
}
