package exceptions;

public class StackOvFlErr {
    public static int printNumber(int x) {
        x *= 2;
        System.out.println(x);
        return x + printNumber(x);
    }
    public static void main(String[] args) {
        printNumber(2);
    }

}
