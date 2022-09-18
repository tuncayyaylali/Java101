import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int num1, num2, select;
        float sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma: " + (num1 * num2));
                break;
            case 4:
                if (num2!=0){
                    sonuc = num1/num2;
                    System.out.println("Bölme: " + sonuc);
                }
                else{
                    System.out.println("Bir sayı sıfıra bölünemez");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}
