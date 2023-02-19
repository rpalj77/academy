package dataTypesOperators.AbstractClass;

public abstract class Parent {
    public int i;

    public Parent(){
        i = 1;
    }

    abstract int getI();

    final void setI(int noveI) {
        i = noveI;
    }
}
