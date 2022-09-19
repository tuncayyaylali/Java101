import java.util.Scanner;

public class DersOrtalamasi {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, ortalama = 0;
        float sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notu: ");
        matematik = input.nextInt();
        if (matematik>=0 && matematik<=100){
            ortalama += matematik;
        }
        System.out.print("Fizik Notu: ");
        fizik = input.nextInt();
        if (fizik>=0 && fizik<=100){
            ortalama += fizik;
        }
        System.out.print("Türkçe Notu: ");
        turkce = input.nextInt();
        if (turkce>=0 && turkce<=100){
            ortalama += turkce;
        }
        System.out.print("Kimya Notu: ");
        kimya = input.nextInt();
        if (kimya>=0 && kimya<=100){
            ortalama += kimya;
        }
        System.out.print("Müzik Notu: ");
        muzik = input.nextInt();
        if (muzik>=0 && muzik<=100){
            ortalama += muzik;
        }
        sonuc = ortalama / 5;
        System.out.println("Ortalamanız : " + sonuc);
        if (sonuc<=55){
            System.out.println("Seneye görüşürüz.");
        }else{
            System.out.println("Tebrikler");
        }

    }
}
