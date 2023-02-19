package dataTypesOperators.RefInterface;

public class Usecka implements IInfo {
    int dlzka;

    Usecka(int dlzka) {
        this.dlzka = dlzka;
    }

    @Override
    public void ktoSom() {
        System.out.println("Usecka");
    }
}
