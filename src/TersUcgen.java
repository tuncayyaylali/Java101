import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();
        for(int l=n; l>0;l--) {
            for (int m = (n - l); m > 0; m--) {
                System.out.print(" ");
            }
            for (int o = ((2*l)-1); o > 0; o--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
