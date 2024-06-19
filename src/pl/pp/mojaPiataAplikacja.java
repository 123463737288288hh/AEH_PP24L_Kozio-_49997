package pl.pp;
import java.util.Scanner;

public class mojaPiataAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char znak;
        int wiersze, kolumny;
        System.out.print("Proszę podaj znak: ");
        znak = scanner.next().charAt(0);
        System.out.print("Proszę podaj ilość wierszy: ");
        wiersze = scanner.nextInt();
        System.out.print("Proszę podaj ilość kolumn: ");
        kolumny = scanner.nextInt();
        for (int i = 1; i <= wiersze; i++) {
            System.out.println(" ");
            for (int j = 1; j <= kolumny; j++)
                System.out.print(znak + " ");
        }
    }
}