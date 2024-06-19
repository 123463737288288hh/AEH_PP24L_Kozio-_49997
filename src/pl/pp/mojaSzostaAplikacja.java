package pl.pp;
import java.util.Scanner;
public class mojaSzostaAplikacja {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();
        int res1 = silniaIteracyjna(n);
        System.out.println("Silnia liczby " + n + " = " + res1 + " (metoda iteracyjna)");
        int res2 = silniaRekurencyjna(n);
        System.out.println("Silnia liczby " + n + " = " + res2 + " (metoda rekurencyjna)");
        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1000000;
        System.out.println("Czas wykonania kodu: " + executionTime + "ms");
    }
    public static int silniaIteracyjna (int a) {
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }
    public static int silniaRekurencyjna (int a) {
        if (a == 0)
            return 1;
        else
            return a * silniaRekurencyjna(a-1);
    }
}
