import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        boolean sonuc;
        sonuc = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı giriniz: ");
        yil = input.nextInt();
        if (yil%4==0){
            if(yil%100==0 && yil%400==0){
                sonuc=true;
            }else if (yil%100!=0){
                sonuc=true;
            }
        }
        System.out.println(sonuc ? yil + " bir artık yıldır.":yil + " bir artık yıl değildir.");
    }
}