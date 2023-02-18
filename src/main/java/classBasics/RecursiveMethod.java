package classBasics;

public class RecursiveMethod {
    static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int number = 400000;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
