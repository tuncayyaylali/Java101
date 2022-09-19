import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km;
        int yas;
        int tip;
        double indirim1=0;
        double indirim2=0;
        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
        tip = input.nextInt();

        if (km<0 || yas<0 || tip<1 || tip>2){
            System.out.println("Hatalı Veri Girdiniz !");
        }else{
            if (yas<12){
                indirim1 = 0.5;
            }else if(yas<24){
                indirim1 = 0.1;
            }else if(yas>65){
                indirim1= 0.3;
            }
            if(tip==2){
                indirim2 = 0.2;
            }
            tutar = km * 0.1;
            tutar -= (tutar*indirim1);
            tutar -= (tutar*indirim2*2);
            System.out.println(tutar);
        }
    }
}
