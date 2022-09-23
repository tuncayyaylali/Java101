import java.util.Scanner;

public class UsRecursive {

    static int us(int sayi, int us, int temp) {
        if (us == 0)
            return temp;
        temp = temp * sayi;
        return us(sayi, us-1, temp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayısını giriniz: ");
        int taban = input.nextInt();
        System.out.println("Üs değerini giriniz.");
        int us = input.nextInt();
        System.out.println(us(taban, us,1));
    }
}
