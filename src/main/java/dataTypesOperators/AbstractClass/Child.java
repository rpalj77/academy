package dataTypesOperators.AbstractClass;

public class Child extends Parent {
    @Override
    int getI() {
        return i * 2;
    }
    void setI(){
        i = 5;
    }


    public static void main(String[] args) {
        Child potomok = new Child();
        potomok.setI(7);
        System.out.println(potomok.getI());
    }
}
