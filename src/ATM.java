import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("tuncay") && password.equals("123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch(select){
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            int price = input.nextInt();
                            if (price<0){
                                System.out.println("Negatif değer girilemez.");
                                break;
                            }
                            balance += price;
                            System.out.println("Yatırılan tutar: " + price);
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            price = input.nextInt();
                            if (price>balance){
                                System.out.println("Çekmek istediğiniz tutar için bakiyeniz yetersizdir.");
                                break;
                            }else{
                                balance -= price;
                                System.out.println("Çekilen tutar: " + price);
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                    System.out.println();
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}