import java.util.Scanner;
public class artik_yil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl girin: ");
        int yil = scanner.nextInt();

        if (artikYilMi(yil)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
        }

        public static boolean artikYilMi(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
        }

    }
    
