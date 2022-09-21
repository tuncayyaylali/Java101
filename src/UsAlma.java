import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int taban, us, total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban sayısını giriniz: ");
        taban = scan.nextInt();
        System.out.println("Üs sayısını giriniz: ");
        us = scan.nextInt();

        for(int i=1;i<=us;i++){
            total*=taban;
        }
        System.out.println(total);

    }
}
