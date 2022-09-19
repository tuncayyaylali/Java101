import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int yil;
        String burc="";
        boolean isError=false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        yil = input.nextInt();
        yil = yil%12;

        switch (yil) {
            case 0 -> burc = "Maymun";
            case 1 -> burc = "Horoz";
            case 2 -> burc = "Köpek";
            case 3 -> burc = "Domuz";
            case 4 -> burc = "Fare";
            case 5 -> burc = "Öküz";
            case 6 -> burc = "Kaplan";
            case 7 -> burc = "Tavşan";
            case 8 -> burc = "Ejderha";
            case 9 -> burc = "Yılan";
            case 10 -> burc = "At";
            case 11 -> burc = "Koyun";
            default -> isError = true;
        }
        if (!isError){
            System.out.println("Çin Zodyak Burcunuz: " + burc);
        }else{
            System.out.println("Hatalı değer girdiniz.");
        }
    }
}