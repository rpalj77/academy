package classBasics;

public class VozidloKonstruktor {
    // instancne premenne
    int pasazieri;
    int nadrz;
    int spotreba;

    // Konstruktor ma rovnaky nazov ako trieda
    //
    VozidloKonstruktor() {
        this.nadrz = 30;
        this.spotreba = 6;
        this.pasazieri = 5;
    }

    // Parametrizovane (pretazene) konstruktory
    VozidloKonstruktor(int nadrz, int spotreba) {
        this.nadrz = nadrz;
        this.spotreba = spotreba;
    }

    VozidloKonstruktor(int nadrz, int spotreba, int pasazieri) {
        this.nadrz = nadrz;
        this.spotreba = spotreba;
        this.pasazieri = pasazieri;
    }
    // metody
    int dojazd() {
        return 100 * nadrz / spotreba;
    }

    double potrebnePalivo(int kilometre) {
        return (double) kilometre * spotreba / 100;
    }

}
