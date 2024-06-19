package pl.pp;

public class mojaDziewiataAplikacja {
    private String numerMagazynu;
    private int dostepnaPrzestrzen;
    private String nazwaWlasciciela;
    private String email;
    private String numerTelefonu;
    private int zajetaPrzestrzen;

    // Konstruktor
    public mojaDziewiataAplikacja(String numerMagazynu, int dostepnaPrzestrzen, String nazwaWlasciciela, String email, String numerTelefonu) {
        this.numerMagazynu = numerMagazynu;
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
        this.zajetaPrzestrzen = 0;
    }

    // Gettery
    public String getNumerMagazynu() {
        return numerMagazynu;
    }

    public int getDostepnaPrzestrzen() {
        return dostepnaPrzestrzen;
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

    // Settery
    public void setNumerMagazynu(String numerMagazynu) {
        this.numerMagazynu = numerMagazynu;
    }

    public void setDostepnaPrzestrzen(int dostepnaPrzestrzen) {
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
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

    // Metody zarządzające magazynem
    public void dodajTowar(int ilosc) {
        if (ilosc <= (dostepnaPrzestrzen - zajetaPrzestrzen)) {
            zajetaPrzestrzen += ilosc;
            System.out.println("Dodano " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (dostepnaPrzestrzen - zajetaPrzestrzen) + " jednostek.");
        } else {
            System.out.println("Za mało miejsca w magazynie. Pozostała przestrzeń magazynowa: " + (dostepnaPrzestrzen - zajetaPrzestrzen) + " jednostek.");
        }
    }

    public void usunTowar(int ilosc) {
        if (ilosc <= zajetaPrzestrzen) {
            zajetaPrzestrzen -= ilosc;
            System.out.println("Usunięto " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (dostepnaPrzestrzen - zajetaPrzestrzen) + " jednostek.");
        } else {
            System.out.println("Nie można usunąć więcej towaru niż jest w magazynie. Zajęta przestrzeń magazynowa: " + zajetaPrzestrzen + " jednostek.");
        }
    }

    public void sprawdzZajetosc() {
        System.out.println("Zajęta przestrzeń magazynowa: " + zajetaPrzestrzen + " jednostek.");
        System.out.println("Dostępna przestrzeń magazynowa: " + (dostepnaPrzestrzen - zajetaPrzestrzen) + " jednostek.");
    }

    public void aktualizujKontakt(String email, String numerTelefonu) {
        this.email = email;
        this.numerTelefonu = numerTelefonu;
        System.out.println("Zaktualizowano dane kontaktowe właściciela.\nNowy email: " + this.email + "\nNowy numer telefonu: " + this.numerTelefonu);
    }

    public static void main(String[] args) {
        mojaDziewiataAplikacja magazyn = new mojaDziewiataAplikacja("001", 5000, "Jan Kowalski", "jan.kowalski@example.com", "123-456-789");
        magazyn.dodajTowar(3000);
        magazyn.usunTowar(1000);
        magazyn.dodajTowar(2500);
        magazyn.sprawdzZajetosc();
        magazyn.aktualizujKontakt("owner@magazyn.pl", "+48 123 456789");
        magazyn.dodajTowar(500);
    }
}
