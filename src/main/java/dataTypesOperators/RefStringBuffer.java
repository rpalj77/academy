package dataTypesOperators;

public class RefStringBuffer {
        public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("string buffer");
        String s = "general string";
        String s2;

        s2 = s.substring(0, 3);
        System.out.println(s);
        System.out.println(s2);

        sb.append(" appended");
        System.out.println(sb);
//        sb.insert(sb.length(), " and inserted");
//        System.out.println(sb);
//
//        sb.replace(0, 13, "StringBuffer");
//        System.out.println(sb);
//
//        sb.delete(0, 13);
//        System.out.println(sb);
    }
}
