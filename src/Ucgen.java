import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        int a,b;
        double hipotenus;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin Kenar Uzunluğunu Giriniz: ");
        a = input.nextInt();

        System.out.println("Üçgenin Diğer Kenar Uzunluğunu Giriniz: ");
        b = input.nextInt();

        hipotenus = Math.sqrt((a*a) + (b*b));

        System.out.println("Kenar Uzunluğu " + a + " ve " + b + " olan dik üçgenin hipotenüsünün uzunluğu " + hipotenus);
    }
}
