import java.util.*;

class abn{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a = 0, b = 0, n = 0, toplam=0;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
        }
            for (int j=0;j<n;j++){
                toplam+=(a+(Math.pow(2,j)*b));
                System.out.print(toplam + " ");
            }
        in.close();
    }
}