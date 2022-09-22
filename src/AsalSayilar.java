public class AsalSayilar {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            int asal=0;
            for(int k=2;k<=i;k++){
                if(i%k==0){
                    asal++;
                }
            }
            if(asal==1){
                System.out.print(i + " ");
            }
        }
    }
}
