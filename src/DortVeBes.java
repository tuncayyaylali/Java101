import java.util.Scanner;

public class DortVeBes {
    public static void main(String[] args) {
        int limit, pow_four=1, pow_five=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz: ");
        limit = scan.nextInt();

        System.out.println("4' ün Kuvvetleri");
        while(pow_four<limit){
            System.out.println(pow_four);
            pow_four*=4;
        }

        System.out.println("5' in Kuvvetleri");
        while(pow_five<limit){
            System.out.println(pow_five);
            pow_five*=5;
        }
    }
}
