import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int day, ay;
        boolean isError = false;
        String burc = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum ayınızı giriniz: ");
        ay = input.nextInt();
        System.out.print("Doğum günününü giriniz: ");
        day = input.nextInt();

        if (ay == 1){
            if (day < 22 && day > 0){
                burc = "Oğlak Burcu";
            }else if (day > 21 && day<32){
                burc = "Kova Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 2){
            if (day < 20 && day > 0){
                burc = "Kova Burcu";
            }else if (day > 19 && day<29){
                burc = "Balık Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 3){
            if (day < 21 && day > 0){
                burc = "Balık Burcu";
            }else if (day > 20 && day<29){
                burc = "Koç Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 4){
            if (day < 21 && day > 0){
                burc = "Koç Burcu";
            }else if (day > 20 && day<29){
                burc = "Boğa Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 5){
            if (day < 22 && day > 0){
                burc = "Boğa Burcu";
            }else if (day > 21 && day<29){
                burc = "İkizler Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 6){
            if (day < 23 && day > 0){
                burc = "İkizler Burcu";
            }else if (day > 22 && day<29){
                burc = "Yengeç Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 7){
            if (day < 23 && day > 0){
                burc = "Yengeç Burcu";
            }else if (day > 22 && day<29){
                burc = "Aslan Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 8){
            if (day < 23 && day > 0){
                burc = "Aslan Burcu";
            }else if (day > 22 && day<29){
                burc = "Başak Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 9){
            if (day < 23 && day > 0){
                burc = "Başak Burcu";
            }else if (day > 22 && day<29){
                burc = "Terazi Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 10){
            if (day < 23 && day > 0){
                burc = "Terazi Burcu";
            }else if (day > 22 && day<29){
                burc = "Akrep Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 11){
            if (day < 22 && day > 0){
                burc = "Akrep Burcu";
            }else if (day > 21 && day<29){
                burc = "Yay Burcu";
            }else{
                isError = true;
            }
        }
        else if(ay == 12){
            if (day < 22 && day > 0){
                burc = "Yay Burcu";
            }else if (day > 21 && day<29){
                burc = "Oğlak Burcu";
            }else{
                isError = true;
            }
        }
        else{
            isError = true;
        }
        System.out.println(burc);
        System.out.println(isError ? "Hatalı değer girdiniz.":"");
    }
}
