import java.util.Scanner;

public class IsPalindrome {
    static int sonBasamak(int sayi, int temp) {
        if (sayi == 0) {
            return temp;
        } else {
            temp = (temp * 10) + (sayi/10);
            return sonBasamak(sayi/10, temp);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi = input.nextInt();
        System.out.println(sonBasamak(sayi, 0)/10);
        System.out.println(sonBasamak(sayi, 0)/10==sayi ? sayi + " bir palindrome sayıdır":sayi + " bir palindrome sayı değildir.");
    }
}