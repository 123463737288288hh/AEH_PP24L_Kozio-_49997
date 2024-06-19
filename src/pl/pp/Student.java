package pl.pp;

class Student {
    private String numerIndeksu;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny;

    public Student(String numerIndeksu, String imie, String nazwisko, List<Integer> oceny) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    public double getSredniaOcen() {
        return oceny.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}