public class mojaCzterynastaAplikacja {
    public static void main(String[] args) {

        class Diesel {
            public String getTypPaliwa() {
                return "Diesel";
            }
        }

        class Benzyna {
            public String getTypPaliwa() {
                return "Benzyna";
            }
        }

        class Elektryk {
            public String getTypPaliwa() {
                return "Elektryk";
            }
        }

        class Pojazd {
            private String nrRejestracyjny;
            private String numerVin;
            private String kolor;
            private double cena;
            private double spalanie;
            private double poziomPaliwa;
            private int przebieg;

            public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena,
                          double spalanie, double poziomPaliwa, int przebieg) {
                this.nrRejestracyjny = nrRejestracyjny;
                this.numerVin = numerVin;
                this.kolor = kolor;
                this.cena = cena;
                this.spalanie = spalanie;
                this.poziomPaliwa = poziomPaliwa;
                this.przebieg = przebieg;
            }

            public void prowadz() {
                System.out.println("Jadę!");
            }

            public void zatankuj() {
                System.out.println("Zatankowano pojazd.");
            }

            public String getNrRejestracyjny() {
                return nrRejestracyjny;
            }

            public void setNrRejestracyjny(String nrRejestracyjny) {
                this.nrRejestracyjny = nrRejestracyjny;
            }

            public String getNumerVin() {
                return numerVin;
            }

            public void setNumerVin(String numerVin) {
                this.numerVin = numerVin;
            }

            public String getKolor() {
                return kolor;
            }

            public void setKolor(String kolor) {
                this.kolor = kolor;
            }

            public double getCena() {
                return cena;
            }

            public void setCena(double cena) {
                this.cena = cena;
            }

            public double getSpalanie() {
                return spalanie;
            }
            public void setSpalanie(double spalanie) {
                this.spalanie = spalanie;
            }

            public double getPoziomPaliwa() {
                return poziomPaliwa;
            }

            public void setPoziomPaliwa(double poziomPaliwa) {
                this.poziomPaliwa = poziomPaliwa;
            }

            public int getPrzebieg() {
                return przebieg;
            }

            public void setPrzebieg(int przebieg) {
                this.przebieg = przebieg;
            }
        }

        class Osobowe extends Pojazd {
            private int liczbaDrzwi;

            public Osobowe(String nrRejestracyjny, String numerVin, String kolor, double cena,
                           double spalanie, double poziomPaliwa, int przebieg, int liczbaDrzwi) {
                super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
                this.liczbaDrzwi = liczbaDrzwi;
            }

            public void prowadz() {
                System.out.println("Jestem osobowym pojazdem. Jadę!");
            }

            public void zatankuj() {
                System.out.println("Zatankowano pojazd osobowy.");
            }
        }

        class Ciezarowka extends Pojazd {
            private double ladownosc;

            public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena,
                              double spalanie, double poziomPaliwa, int przebieg, double ladownosc) {
                super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
                this.ladownosc = ladownosc;
            }

            public void prowadz() {
                System.out.println("Jadę ciężarówką.");
            }

            public void zatankuj() {
                System.out.println("Zatankowano ciężarówkę.");
            }
        }
        class Motocykl extends Pojazd {
            private boolean posiadaDostawke;

            public Motocykl(String nrRejestracyjny, String numerVin, String kolor, double cena,
                            double spalanie, double poziomPaliwa, int przebieg, boolean posiadaDostawke) {
                super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
                this.posiadaDostawke = posiadaDostawke;
            }

            public void prowadz() {
                System.out.println("Jadę motocyklem!");
            }

            public void zatankuj() {
                System.out.println("Zatankowano motocykl.");
            }
        }

        class SprzetBudowlany extends Pojazd {
            private int przepracowaneGodziny;

            public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, double cena,
                                   double spalanie, double poziomPaliwa, int przebieg, int przepracowaneGodziny) {
                super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
                this.przepracowaneGodziny = przepracowaneGodziny;
            }
        }

        public void prowadz() {
            System.out.println("Używam sprzętu budowlanego.");
        }

        public void zatankuj() {
            System.out.println("Sprzęt budowlany został zatankowany.");
        }
    }

    class TestWypozyczalni {
        public static void main(String[] args) {
            Pojazd osobowy = new Osobowe ("APC123", "VIN193", "Srebny", 20000.0, 6.5, 50.0, 100000, 4);
            Pojazd ciezarowka = new Ciezarowka( "XBZ456", "VIN856", "Niebieski", 80000.0, 15.0, 120.0, 200000, 5000.0);
            Pojazd motocykl = new Motocykl ("ZEF789", "VIN709", "Brązowy", 15000.0, 3.0, 20.0, 50000, true);
            Pojazd sprzetBudowlany = new SprzetBudowlany ("GHI012", "VIN012", "Zielony", 100000.0, 25.0, 200.0, 300000, 8000);

            osobowy.prowadz();
            osobowy.zatankuj();

            ciezarowka.prowadz();
            ciezarowka.zatankuj();

            motocykl.prowadz();
            motocykl.zatankuj();

            sprzetBudowlany.prowadz();
            sprzetBudowlany.zatankuj();
        }
    }
}
    }
