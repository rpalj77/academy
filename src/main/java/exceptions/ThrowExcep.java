package exceptions;

public class ThrowExcep {
    public static void main(String[] args) {
        try {
            System.out.println("Pred vyvolanim vynimky");
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println("Zachytenie vynimky");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Zachytenie inej vznimky");
        }
    }
}
