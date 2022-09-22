import java.util.Scanner;

public class KucukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adet;
        do{
            System.out.print("Kaç sayı girmek istersiniz: ");
            adet = input.nextInt();
        }while(adet<2);

        int gecici;

        System.out.print("1. sayıyı giriniz: ");
        gecici = input.nextInt();
        int buyuk = gecici, kucuk = gecici;

        for(int i=2;i<=adet;i++){
            System.out.print(i + ". sayıyı giriniz: ");
            gecici = input.nextInt();
            if(gecici>buyuk){
                buyuk=gecici;
            }
            if(gecici<kucuk){
                kucuk=gecici;
            }
        }

        System.out.println("En büyük sayı: " + buyuk);
        System.out.println("En küçük sayı: " + kucuk);
    }
}
