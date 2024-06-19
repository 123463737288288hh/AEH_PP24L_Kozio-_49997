package pl.pp;
import java.util.Scanner;
public class mojaCzwartaAplikacja2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. exit");
            System.out.print("Wybierz opcje: ");
            int a = scanner.nextInt();
            System.out.print("Podaj dwie liczby: ");
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int res = 0;
            while (true) {
                if (a == 1) {
                    res = b + c;
                    System.out.println(b + " + " + c + " = " + res);
                    break;
                } else if (a == 2) {
                    res = b - c;
                    System.out.println(b + " - " + c + " = " + res);
                    break;
                } else if (a == 3) {
                    res = b * c;
                    System.out.println(b + " * " + c + " = " + res);
                    break;
                } else if (a == 4) {
                    res = b / c;
                    System.out.println(b + " / " + c + " = " + res);
                    break;
                } else if (a == 5) {
                    break;
                }
                else {
                    System.out.print("Wybierz opcje: ");
                    a = scanner.nextInt();
                }
            }
        }
    }
}