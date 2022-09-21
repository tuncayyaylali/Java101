import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int i, j, k, n, r;
        long ntotal=1, rtotal=1, nrtotal=1;
        long kombinasyon;
        Scanner scan = new Scanner(System.in);

        System.out.println("n değerini giriniz: ");
        n = scan.nextInt();
        System.out.println("r değerini giriniz: ");
        r = scan.nextInt();

        for (i=1; i<=n; i++){
            ntotal *= i;
        }
        for (j=1; j<=r; j++){
            rtotal *= j;
        }
        for (k=1; k<=(n-r); k++){
            nrtotal *= k;
        }
        kombinasyon = ntotal/(rtotal*nrtotal);
        System.out.println(n + " değerinin " + r + " değerli kombinasyonu: " + kombinasyon);
    }
}
