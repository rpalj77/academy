package designpatterns.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        if(singletonExample.equals(singletonExample2)){
            System.out.println("Objekty sa rovnajú");
        }
    }
}
