package solid.liskovsubst;

public class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void on() {
        System.out.println("Engine is started.");
    }

    public void powerOn(int power) {
        System.out.println("Power is increased to " + power);
    }
}
