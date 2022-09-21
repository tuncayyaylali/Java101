import java.util.Scanner;

public class BasamakDegerleriToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scan.nextInt();
        int basValue;
        int result = 0;

        while(number != 0){
            basValue = number%10;
            result+=basValue;
            number/=10;
        }
        System.out.println(result);
    }
}
