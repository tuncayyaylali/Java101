import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İstediğiniz terim sayısını giriniz: ");
        int sayi = input.nextInt();
        int f0=0, f1=1, fbir=0,fiki=1, fson=0;
        System.out.print(f0 + " " + f1);
        for (int i=1;i<sayi;i++){
            fson=fiki+fbir;
            fbir=fiki;
            fiki=fson;
            System.out.print(" " + fson);
        }
    }
}
