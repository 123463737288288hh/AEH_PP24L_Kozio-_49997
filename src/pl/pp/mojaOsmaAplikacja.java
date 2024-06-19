package pp.pl;

public class mojaOsmaAplikacja {
    private String numerKonta;
    private double srodki;
    private String nazwaWlasciciela;
    private String email;
    private String numerTelefonu;

    public mojaOsmaAplikacja(String numerKonta, double srodki, String nazwaWlasciciela, String email, String numerTelefonu) {
        this.numerKonta = numerKonta;
        this.srodki = srodki;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public double getSrodki() {
        return srodki;
    }

    public String getNazwaWlasciciela() {
        return nazwaWlasciciela;
    }

    public String getEmail() {
        return email;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public void setSrodki(double srodki) {
        this.srodki = srodki;
    }

    public void setNazwaWlasciciela(String nazwaWlasciciela) {
        this.nazwaWlasciciela = nazwaWlasciciela;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public void zasilenieKonta(double kwota) {
        if (kwota > 0) {
            srodki += kwota;
            System.out.println("Wpłata PLN " + kwota + " została wykonana. Nowe saldo PLN " + srodki + ".");
        } else {
            System.out.println("Kwota do wpłaty musi być większa niż zero.");
        }
    }

    public void wyciagniecieKonta(double kwota) {
        if (kwota > 0) {
            if (srodki >= kwota) {
                srodki -= kwota;
                System.out.println("Pobrano PLN " + kwota + " z konta, Pozostałe saldo = PLN " + srodki + ".");
            } else {
                System.out.println("Brak środków. Masz PLN " + srodki + " na koncie.");
            }
        } else {
            System.out.println("Kwota do wypłaty musi być większa niż zero.");
        }
    }

    public static void main(String[] args) {
        mojaOsmaAplikacja konto = new mojaOsmaAplikacja("1234567890", 1000.0, "Jan Kowalski", "jan.kowalski@example.com", "123-456-789");
        konto.wyciagniecieKonta(900.0);
        konto.zasilenieKonta(250.0);
        konto.wyciagniecieKonta(50.0);
        konto.wyciagniecieKonta(500.0);
    }
}
