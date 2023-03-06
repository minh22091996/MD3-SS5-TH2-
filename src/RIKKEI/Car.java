package RIKKEI;

public class Car {
    private String name;
    private String engine;
    public static int number;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        number ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Car.number = number;
    }
}
