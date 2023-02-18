package classBasics;

public class VolanieVozidlaKonstruktor {
    public static void main(String[] args) {
        int kilometre = 150;
        VozidloKonstruktor osobneAutoDefault = new VozidloKonstruktor();
        VozidloKonstruktor osobneAuto = new VozidloKonstruktor(40, 7);
        VozidloKonstruktor dodavka = new VozidloKonstruktor(60, 10, 2);


        System.out.println("'Default' auto ma dojazd " + osobneAutoDefault.dojazd());
        System.out.println("'Default' auto potrebuje na " + kilometre + " km: " + osobneAutoDefault.potrebnePalivo(kilometre) + " litrov paliva.");
        System.out.println("Osobne auto ma dojazd " + osobneAuto.dojazd());
        System.out.println("Osobne auto potrebuje na " + kilometre + " km: " + osobneAuto.potrebnePalivo(kilometre) + " litrov paliva.");
        System.out.println("Dodavka ma dojazd " + dodavka.dojazd());
        System.out.println("Dodavka potrebuje na " + kilometre + " km: " + dodavka.potrebnePalivo(kilometre) + " litrov paliva.");
    }
}
