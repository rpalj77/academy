package generics;

public class TestTyp {
    public static void main(String[] args) {
        Gen<Integer> iObj; // vytvorenie odkazu na objekt typu Gen<Integer>

        iObj = new Gen<Integer>(50);
//        iObj = new Gen<>(50);
        iObj.zobrazTyp();
        int cislo = iObj.vratObj(); // nie je nutne pretypovanie
        System.out.println("iObj: " + cislo);

        Gen<String> strObj; // vytvorenie odkazu na objekt typu Gen<Integer>

        strObj = new Gen<String>("lubovolny string");
        strObj.zobrazTyp();
        String str = strObj.vratObj();
        System.out.println("strObj: " + str);

    }
}
