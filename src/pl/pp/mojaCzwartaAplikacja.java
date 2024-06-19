package pl.pp;
import java.util.Scanner;
public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Proszę podaj dolną i górną granicę: ");
            int dolna = scanner.nextInt();
            int górna = scanner.nextInt();
            int sum = 0;
            for (int i = dolna;i <= górna;i++) {
                sum = sum + (i * i);
            }
            if (dolna == górna)
                break;
            System.out.println("Suma kwadratów od " + (dolna * dolna) + " do " + (górna * górna) + " to " + sum);
        }
        scanner.close();
    }
}