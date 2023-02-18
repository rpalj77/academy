package classBasics;

public class Vozidlo {
    // instancne premenne
    int pasazieri;
    int nadrz;
    int spotreba;

    // metody
    int dojazd() {
        return 100 * nadrz / spotreba;
    }

    double potrebnePalivo(int kilometre) {
        return (double) kilometre * spotreba / 100;
    }

}
