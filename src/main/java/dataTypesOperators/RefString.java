package dataTypesOperators;

public class RefString {
    public static void main(String[] args) {
        String s1 = "My string";
        // Strings are immutable
        String s2 = s1.substring(3);
        String s3 = " String to trim.    ";
        String s4 = "C# is the best.";
        String s5 = new String("new string");

        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1.length());
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.contains("Mine"));
//        System.out.println(s1.endsWith("ing"));
//        System.out.println(s3.trim());
//        System.out.println(s4.replace("C#", "Java"));
//        System.out.println(s4.isEmpty());

        // %d pre cele cisla
        //	%s pre String
        //	%f pre float. Mozeme
        //	definovat dlzku desatinnej casti, napr: %.2f pre dve desatinne miesta.
//        int a = 10;
//        int b = 20;
//        int c = a + b;
//        String s = String.format("Ked scitame %d a %d, dostaneme %d.", a, b, c);
//        System.out.println(s);
    }

}
