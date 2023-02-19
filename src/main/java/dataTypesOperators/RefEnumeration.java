package dataTypesOperators;

public class RefEnumeration {
    enum Vyucujuci {
        ASISTENT,
        ODBORNY_ASISTENT,
        DOCENT,
        PROFESOR
    }

    public static void main(String[] args) {
        Vyucujuci ucitel = Vyucujuci.PROFESOR;

        if (ucitel == Vyucujuci.ASISTENT)
            System.out.println("Ahoj kamo");
        else if (ucitel == Vyucujuci.PROFESOR) {
            System.out.println("Dobry den pan profesor");
        }
    }
}
