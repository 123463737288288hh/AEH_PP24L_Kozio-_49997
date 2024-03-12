package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        double x = 10;
        var result = 2 * x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("2*x" + result);
        result = x * x;
        System.out.println("x * x = " + result);
        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
        double first = scanner.nextDouble();//prośba o wpisanie wartości typu double
        double second = scanner.nextDouble();
        System.out.println("x + x = " + (first + second));

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Proszę podaj swoj wiek:");
        double x1 = scanner1.nextDouble();
        var wiekwsek = x1*12*365*24*3600;

        System.out.println("wiek w sek =  " + wiekwsek);

        scanner.close();
        scanner1.close();
    }
}