import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("abc")) {
            System.out.println("Bilgileriniz doğrudur.");
        } else {
            System.out.println("Bilgileriniz yanlıştır. Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("1- Evet");
            System.out.println("2- Hayır");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Yeni şifrenizi giriniz.");
                    Scanner giris = new Scanner(System.in);
                    newPassword = giris.nextLine();
                    if (newPassword.equals("abc")) {
                        System.out.println("Şifre oluşturulamadı. Lütfen yeni şifre giriniz.");
                        newPassword = giris.nextLine();
                        password = newPassword;
                        System.out.println("Yenilenen Şifreniz: " + password);
                    } else {
                        password = newPassword;
                        System.out.println("Yeni Şifreniz: " + password);
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz.");
            }
        }

    }

}
