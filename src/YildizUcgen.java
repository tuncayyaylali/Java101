import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for(int i=0; i<=n;i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=n-1; l>0;l--) { //l=4 l=1
            for (int m = (n - l); m > 0; m--) { //m=1 m=4
                System.out.print(" ");
            }
            for (int o = ((2*l)-1); o > 0; o--) { //o=7 o=1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
