package dataTypesOperators;

public class RefArray {
    public static void main(String[] args) {
        int pole[] = new int[10];
        int[] pole2 = new int[10];
        // Inicializovane pole
        int[]  prvocisla = {1, 2, 3, 5, 7, 11};

        int i;

        for (i = 0; i < 10; i++) {
            pole[i] = i*i;
        }

        for (i = 0; i < 10; i++) {
            System.out.println("Pole [" + i + "]: " + pole[i]);
        }

        System.out.println("Velkost pola je: " + pole.length);
    }



}
