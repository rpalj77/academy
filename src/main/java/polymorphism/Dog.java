package polymorphism;

import inheritence.Animal;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Dog noise");;
    }

    public void printDog(){
        System.out.println("This is a dog.");
    }

    public void printDog(String name){
        System.out.println("This is a dog named " + name + ".");
    }

    public void printDog(String name, String race){
        System.out.println("This is a dog named " + name + ". It is race " + race + ".");
    }

    public void printDog(String name, int age){
        System.out.println("This is a dog named " + name + ". It is " + age + " years old.");
    }
}
