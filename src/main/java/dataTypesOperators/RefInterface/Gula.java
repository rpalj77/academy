package dataTypesOperators.RefInterface;

public class Gula implements IInfo {
    int polomer;

    Gula(int polomer) {
        this.polomer = polomer;
    }

    @Override
    public void ktoSom() {
        System.out.println("Gula");
    }
}
