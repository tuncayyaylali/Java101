import java.util.Scanner;

public class UcDort {
    public static void main(String[] args) {
        int sayi, sayim=0, sayilar=0;
        float ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayınız Giriniz: ");
        sayi = input.nextInt();

        for (int i=1; i<=sayi; i++){
            if (i%3==0 || i%4==0){
                System.out.println(i);
                sayilar += i;
                sayim +=1;
            }
        }
        if(sayilar!=0){
            ortalama = sayilar / sayim;
            System.out.println(ortalama);
        }
    }
}