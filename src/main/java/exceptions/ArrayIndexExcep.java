package exceptions;

public class ArrayIndexExcep {
   public static void main(String[] args) {
        int[] cisla = new int[4];

        try {
            System.out.println("Pred vygenerovanim vynimky.");
            cisla[7] = 10;
            System.out.println("Toto sa nezobrazi");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds!");
        }
        finally {
            System.out.println("Toto sa vzdy vykona");
        }
    }
}
