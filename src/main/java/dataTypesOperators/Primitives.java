package dataTypesOperators;

public class Primitives {
    public static void main(String[] args) {
        // byte (8-bits) - value range from -128 to 127
        byte age = 58;

        // short (16-bits) - value range from -32768 to 32767
        short s = 32000;

        // int (32-bits) - value range from -2147483648 to 2147483647
        int i = 100_000_000;

        // long (64-bits) - value range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l2 = 100_000_000_000_000_000L;

        // float (32-bits)
        float f = 3.14f;
        // double (64-bits)
        double d = 3.14;
        // boolean (8-bits)
        boolean b = false;
        // char (16-bits)
        char c = 'A';

        // konverzia na zakladne datove typy - wrapper class
        double d1 = Double.parseDouble("3.14");
        int i1 = Integer.parseInt("100");
        int i2 = Integer.valueOf(120);

        // Widening Primitive Conversions
        int myInt = 127;
        long myLong = myInt;
        float myFloat = myLong;
        double myDouble = myLong;

        // Narrowing Primitive Conversion - casting
        int myInt2 = (int) myDouble;
        byte myByte = (byte) myInt2;

        System.out.println(d1);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

    }
}
