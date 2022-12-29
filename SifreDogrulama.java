package Orneklerim;

import java.util.Scanner;

public class SifreDogrulama {
    public static void main(String[] args){
        String pass = "12345";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz: ");

        String userpass = scanner.nextLine();

        if (userpass.equals(pass)){
            System.out.println("Giriş Başarılı! ");
        }
        else{
            System.out.println("Giriş Başarısız!");
        }

        System.out.println("I love Java");
    }
}
