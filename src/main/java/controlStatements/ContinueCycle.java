package controlStatements;

public class ContinueCycle {
    public static void main(String[] args) {

        // vypis parne cisla
        for(int i = 0; i <= 100; i++){
            if ((i % 2) != 0) continue;
            System.out.println(i);
        }
    }
}
