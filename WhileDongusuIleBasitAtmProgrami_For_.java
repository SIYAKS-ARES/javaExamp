package Orneklerim;
import java.util.Scanner;
public class WhileDongusuIleBasitAtmProgrami_For_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double bakiye = 5000.0;
        int sayac = 3;
        int a = 3;

        System.out.println("\n");
        System.out.println("Yazılım Banka hoş geldiniz!\n");
        System.out.println("Lütfen kartınızı kart haznesine yerleştiriniz ve tamam yazınız...");

        while (true) {
            String durum1 = scanner.nextLine();

            if (durum1.equals("tamam")) {
                String pass = "12345";
                System.out.print("Lütfen şifrenizi giriniz:");

                while (sayac <= 3) {
                    String userpass = scanner.nextLine();


                    if (userpass.equals(pass)) {
                        System.out.println("Giriş Başarılı!");
                        break;
                    } else {
                        System.err.println("Giriş Başarısız, tekrar deneyiniz!");
                        System.err.print("Kalan deneme hakkınız:" + --sayac + "\nLütfen şifrenizi giriniz:");

                        if (sayac <= 0) {
                            System.exit(0);

                        }
                    }
                }
                break;
            } else {
                if (a > 1) {
                    System.err.println("Lütfen doğru yazdığınızdan emin olunuz!");
                    System.err.println("Kalan deneme hakkınız:" + --a);
                    System.err.println("Lütfen kartınızı kart haznesine yerleştiriniz ve tamam yazınız...");

                } else {
                    System.out.println("Kartınızı hazneden alınız ve işlemleri tekrarlayınız.");
                    System.exit(0);
                }
            }
        }
        String islemer = """
                1. İşlem : Bakiye öğrenme
                2. İşlem : Para çekme
                3. İşlem : Para yatırma
                Çıkış için 4'a basınız.""";
        System.out.println("*************************");
        System.out.println(islemer);
        System.out.println("*************************");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");

        while (true) {

        String islem = scanner.nextLine();

            if (islem.equals("4")) {
                System.out.println("Çıkış yapılıyor...");
                System.out.println("Bizi tercih ettiğiniz için teşekkür eder, iyi günler dileriz...");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Bakiyeniz = " + bakiye +
                                 "\nLütfen yapmak istediğiniz işlemi seçiniz:");
            } else if (islem.equals("2")) {
                System.out.println("Bakiyeniz = " + bakiye);
                    System.out.print("Lütfen çekmek istediğiniz tutarı giriniz:");
                    int cekilecektutar = scanner.nextInt();
                    scanner.nextLine();

                    if(bakiye-cekilecektutar<0){
                        System.out.println("Yetersiz bakiye!\nBakiyeniz:" + bakiye);
                        System.out.print("Dilerseniz %1.5 faiz ile kredi seçenekleri mevcuttur.\n" +
                                         "Lütfen yapmak istediğiniz işlemi seçiniz:");
                    }
                    else {
                        bakiye -= cekilecektutar;
                        System.out.println("Kalan bakiye = " + (bakiye) + "\n");
                    System.out.println("Önce Kartınızı alınız, ardından para bölmesinden " + cekilecektutar +
                                       " TL miktarındaki nakit paranızı alınız...");
                    break;
                    }
            } else if (islem.equals("3")) {
                System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz:");
                int yatirilacaktutar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Parayı hazneye koyunuz, ardından bekleyiniz...");
                bakiye += yatirilacaktutar;
                System.out.print("Yeni bakiyeniz " + (bakiye) + " olmuştur.\n" +
                                    "Lütfen yapmak istediğiniz işlemi seçiniz:");
            } else {
                System.err.print("Yanlış seçim!\n" + "Lütfen yukarıdaki işlemlerden bir tanesini seçiniz:");
            }
        }
    }
}
