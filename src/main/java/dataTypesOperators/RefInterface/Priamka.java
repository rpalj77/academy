package dataTypesOperators.RefInterface;

public class Priamka implements IInfo, IDalsieInfo {
    int dlzka;

    Priamka(int dlzka) {
        this.dlzka = dlzka;
    }

    @Override
    public void ktoSom() {
        System.out.print("Priamka");
    }

    @Override
    public void vlastnosti() {
        System.out.println(" = " + dlzka);
    }
}
