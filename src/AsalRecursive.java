import java.util.Scanner;

public class AsalRecursive {

    static int asal(int sayi, int bolen, int dongu) {
        if(bolen>sayi){
            System.out.println("Nihai Döngü: " + dongu);
            return dongu;
        }
        if(sayi%bolen==0){
            dongu++;
            System.out.println("Sayı: " + sayi);
            System.out.println("Bölen: " + bolen);
            System.out.println("Döngü: " + dongu);
            System.out.println();
        }
        bolen++;
        return asal(sayi, bolen, dongu);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi = input.nextInt();
        System.out.println(asal(sayi, 1, 0)==2 ? "Sayı asaldır.":"Sayı asal değildir.");
    }
}
