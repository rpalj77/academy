package controlStatements;


public class BeakStitok {
    public static void main(String[] args) {
        // stitok, navestie (goto)
        int i;

        for (i = 1; i < 4; i++) {
            jedna: {
                dva:{
                    tri: {
                        System.out.println("i je " + i);
                        if (i == 1) break jedna; // navestie, stitok
                        if (i == 2) break dva;
                        if (i == 3) break tri;

                        System.out.println("Toto sa nikdy nevypise");
                    }
                    System.out.println("Koniec bloku so stitkom tri");
                }
                System.out.println("Koniec bloku so stitkom dva");
            }
            System.out.println("Koniec bloku so stitkom jedna");
        }
        System.out.println("Po prikaze for");
    }
}
