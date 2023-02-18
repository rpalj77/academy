package controlStatements;

import java.io.IOException;

public class BreakCycle {
    public static void main(String[] args) throws IOException {
        char znak;

        for (;;){
            znak = (char) System.in.read();
            if (znak == 'k') break;
        }
    }
}
