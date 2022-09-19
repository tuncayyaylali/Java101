import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();
        System.out.println(heat<5 ? "Kayak yap":"");
        System.out.println(heat>=5 && heat<=15 ? "Sinemaya git": "");
        System.out.println(heat>=10 && heat<=25 ? "Pikniğe git": "");
        System.out.println(heat>25 ? "Yüzmeye git": "");
    }
}
