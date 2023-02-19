package dataTypesOperators;

public class RefArrayMultidimentional {
    public static void main(String[] args) {
        // Dvojrozmerne pole
        String[][] tabulka = new String[3][4];

        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 4; columnIndex++) {
                tabulka[rowIndex][columnIndex] = rowIndex + ":" + columnIndex;
            }
        }

        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 4; columnIndex++) {
                System.out.print(tabulka[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
        
    }



}
