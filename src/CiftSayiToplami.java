import java.util.Scanner;

public class CiftSayiToplami {
    public static void main(String[] args) {
        int number;
        int total=0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Sayı giriniz: ");
            number = scan.nextInt();
            if (number%4==0){
                total += number;
            }
        }while(number%2==0);

        System.out.println("Girilen sayılardan 4' e tam bölünenlerin toplamı :" + total);
    }
}
