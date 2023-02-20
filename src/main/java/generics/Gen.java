package generics;

public class Gen<T>{
    private T obj; // deklaracia objektu typu T

    public Gen(T obj) {
        this.obj = obj;
    }

    T vratObj() {
        return  obj;
    }

    // Vypise typ T
    void zobrazTyp(){
        System.out.println("Typ T je: " + obj.getClass().getName());
    }
}
