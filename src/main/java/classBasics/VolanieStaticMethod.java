package classBasics;

public class VolanieStaticMethod {
    public static void main(String[] args) {
        double r = 15.2;

        System.out.println("Pi je: " + StaticMethod.pi);
        System.out.println("Obsah kruhu: " + StaticMethod.vypocetObsahuKruhu(r));
        System.out.println("Obvod kruhu: " + StaticMethod.vypocetObvoduKruhu(r));

    }
}
