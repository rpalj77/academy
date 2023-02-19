package dataTypesOperators.RefInterface;

public class TestInfoDalsieInfo {
    public static void main(String[] args) {
        Priamka u = new Priamka(100);

        u.ktoSom();
        u.vlastnosti();

        // Zistenie, ci trieda implementuje nejake rozhranie
//        if (u instanceof IInfo)
//            System.out.println("u implementuje IInfo");
    }
}

