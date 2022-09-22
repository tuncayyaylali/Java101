import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n1=input.nextInt();
        System.out.println("Diğer sayıyı giriniz: ");
        int n2 = input.nextInt();
        int ebob=1;
        int ekok=1;
        int small;
        int i=1;
        if (n1<n2){
            small=n1;
        }else{
            small=n2;
        }
        System.out.println("En küçük sayı: " + small);

        while (i<=small){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);

        int tempSmall = small;

        while (tempSmall<=(n1*n2)){
            if (tempSmall%n1==0 && tempSmall%n2==0){
                ekok=tempSmall;
                break;
            }
            tempSmall++;
        }
        System.out.println("EKOK: " + ekok);
        System.out.println("EKOK: " + (n1*n2/ebob));
    }
}
