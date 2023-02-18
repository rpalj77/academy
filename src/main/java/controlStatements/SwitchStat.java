package controlStatements;

public class SwitchStat {
    public static void main(String[] args){
        String language = "english";

        switch(language) {
            case "english":
                System.out.println("Welcome");
                break;
            case "deutsch":
                System.out.println("Wilkommen");
                break;
            case "slovensky":
                System.out.println("Vitajte");
                break;
            default:
                System.out.println("Language not supported");
        }
    }
}
