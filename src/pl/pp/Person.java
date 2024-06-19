package pl.pp;

public class Person {
    // pola (atrybuty) klasy określającej obiekt "Person" (jego parametry/cechy)
    public String forename; // pole przechowujące cechę imię
    public String surname; // pole przechowujące cechę nazwisko
    public int age; // pole przechowujące cechę wiek
    public String ulica;
    public int numerBudynku;
    /**
     * Konstruktor domyślny - element inicjalizujący pola obiektu podczas jego
     tworzenia
     * (jeśli sami nie podamy żadnych parametrów)
     */
    public Person() {
    }
    /**
     * Konstruktor z trzema parametrami, które możemy podać przy jego
     tworzeniu
     */
    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }
    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " +
                "Mam " + age + " lat. Mieszkam na ulicy " +
                ulica + " w budynku " + numerBudynku + ".");
    }
    // przykładowa metoda growOld, która zwiększa dany wiek obiektu o jeden za każdym jej wywołaniem
    public int growOld(int n){
        age = age + n;
        return age;
    }
    // przykładowa metoda getName zwracająca wartość forename obiektu
    public String getName(){
        return forename;
    }
    // przykładowa metoda setName ustawiająca wartość forename obiektu
    public void setName(String nameToSet){
        forename = nameToSet;
    }
    public void adres(String initUlica, int initNumerBudynku){
        ulica = initUlica;
        numerBudynku = initNumerBudynku;
    }
    public int beYounge(){
        age -= 1;
        return age;
    }
}