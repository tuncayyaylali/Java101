import java.util.Scanner;

public class Desen {

    static int desen(int sayi1, int sayi2, int ilkSayi) {
        int temp = sayi2 - 5;
        if (sayi1 >= sayi2) {
            sayi1=sayi2;
            if ((temp == 0) || (temp < -5)) {
                sayi2 = sayi2 + 5;
            } else {
                sayi2 = sayi2 - 5;
            }
        }else{
            sayi1=sayi2;
            sayi2+=5;
        }
        if(sayi2 == ilkSayi){
            System.out.print(sayi2);
            return 0;
        }
        System.out.print(sayi1 + " ");
        return desen(sayi1, sayi2, ilkSayi);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        desen(sayi, sayi, sayi);

        /* int j = 0;
        int i;
        for (i = sayi; i > sayi % 5 - 5; i -= 5) {
            System.out.print(i + " ");
        }
        for (j = i; j <= sayi; j += 5) {
            System.out.print(j + " ");
        }
        int temp=sayi;*/
    }
}
