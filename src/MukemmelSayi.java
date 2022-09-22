import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        do{
            System.out.println("Bir sayı giriniz: ");
            sayi = input.nextInt();
        }while(sayi<1);
        int toplam=0;
        for(int i=1; i<sayi;i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (toplam==sayi){
            System.out.println(sayi + " bir mükemmel sayıdır.");
        }else{
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }
}
