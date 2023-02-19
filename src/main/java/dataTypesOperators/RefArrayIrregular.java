package dataTypesOperators;

public class RefArrayIrregular {
    public static void main(String[] args) {
        // Nepravidelne pole - nutne uviest pamat pre lavu dimenziu.

        // Kyvadlova doprava 10x cez tyzden, 2x cez vikend

        int cestujuci[][] = new int[7][];
        int i, j;

        cestujuci[0] = new int[10];
        cestujuci[1] = new int[10];
        cestujuci[2] = new int[10];
        cestujuci[3] = new int[10];
        cestujuci[4] = new int[10];
        cestujuci[5] = new int[2];
        cestujuci[6] = new int[2];

        // Fill in data
        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)
                cestujuci[i][j] = i + j + 10;
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)
                cestujuci[i][j] = i + j + 10;


        System.out.println("Cestujuci prac. dni:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(cestujuci[i][j] + " ");
            System.out.println();
        }

        System.out.println("Cestujuci vikend:");
        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(cestujuci[i][j] + " ");
            System.out.println();
        }
    }



}
