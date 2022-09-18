import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int a,b, c;
        double alan, doublecevre;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin Kenar Uzunluğunu Giriniz: ");
        a = input.nextInt();

        System.out.println("Üçgenin Diğer Kenar Uzunluğunu Giriniz: ");
        b = input.nextInt();

        System.out.println("Üçgenin Diğer Kenar Uzunluğunu Giriniz: ");
        c = input.nextInt();

        doublecevre = (a + b + c)/2;
        alan = Math.sqrt(doublecevre * (doublecevre - a) * (doublecevre -b) * (doublecevre - c));

        System.out.println("Kenar Uzunluğu " + a + ", " + b + " ve " + c + " olan üçgenin alanı " + alan);
    }
}