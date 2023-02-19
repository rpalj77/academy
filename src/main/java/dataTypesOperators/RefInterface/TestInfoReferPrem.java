package dataTypesOperators.RefInterface;

public class TestInfoReferPrem {
    public static void main(String[] args) {
        Usecka u = new Usecka(100);
        // Pouzitie rozhrania ako referencnej premennej
        IInfo g = new Gula(25);
        g.ktoSom();
        g = u;
        g.ktoSom();
    }
}
