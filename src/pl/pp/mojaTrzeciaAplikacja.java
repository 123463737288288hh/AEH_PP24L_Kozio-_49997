package pl.pp;
public class mojaTrzeciaAplikacja {

    Scanner scanner = new Scanner(System.in);
    int liczbaDni;

    {
        System.out.print("Podaj liczbę dni (wartość niedodatnia, aby zakończyć): ");
        liczbaDni = scanner.nextInt();
        if (liczbaDni <= 0) {
            System.out.println("Koniec programu.");
            try {
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        int tygodnie = liczbaDni / 7;
        int dniReszta = liczbaDni % 7;
        System.out.println(liczbaDni + " dni to " + tygodnie + " tygodnie i " + dniReszta + " dni.");
        scanner.close();
    }
}
package pl.pp;
public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaFahrenheit, temperaturaCelsjusz, temperaturaKelwin;

        while (true) {
            System.out.print("Podaj temperaturę w stopniach Fahrenheit'a (wpisz -1, aby zakończyć): ");
            temperaturaFahrenheit = scanner.nextDouble();

            if (temperaturaFahrenheit == -1) {
                System.out.println("Koniec programu.");
                break;
            }

            temperaturaCelsjusz = (temperaturaFahrenheit - 32.0) / 1.8;
            temperaturaKelwin = temperaturaCelsjusz + 273.16;

            System.out.printf("Temperatura w stopniach Celsiusza: %.2f\n", temperaturaCelsjusz);
            System.out.printf("Temperatura w stopniach Kelvina: %.2f\n", temperaturaKelwin);
        }

        scanner.close();
    }
}

