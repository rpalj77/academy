package classBasics;

public class VolanieVozidla {
    public static void main(String[] args) {
        int kilometre = 150;
        Vozidlo osobneAuto = new Vozidlo();
        Vozidlo dodavka = new Vozidlo();

        osobneAuto.spotreba = 7;
        osobneAuto.nadrz = 40;
        osobneAuto.pasazieri = 4;

        dodavka.spotreba = 10;
        dodavka.nadrz = 60;
        dodavka.pasazieri = 2;

        System.out.println("Osobne auto ma dojazd " + osobneAuto.dojazd());
        System.out.println("Osobne auto potrebuje na " + kilometre + " km: " + osobneAuto.potrebnePalivo(kilometre) + " litrov paliva.");
        System.out.println("Dodavka ma dojazd " + dodavka.dojazd());
        System.out.println("Dodavka potrebuje na " + kilometre + " km: " + dodavka.potrebnePalivo(kilometre) + " litrov paliva.");
    }
}
