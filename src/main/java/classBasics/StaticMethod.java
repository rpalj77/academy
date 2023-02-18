package classBasics;

public class StaticMethod {

    static double pi = 3.14;


    static double vypocetObvoduKruhu(double polomer) {
        return 2 * pi * polomer;
    }

    static double vypocetObsahuKruhu(double polomer) {
        return pi * polomer * polomer;
    }
}
