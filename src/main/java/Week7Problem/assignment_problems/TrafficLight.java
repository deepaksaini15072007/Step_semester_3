package Week7Problem.assignment_problems;

public class TrafficLight {

    private String color;
    private final int id;

    public TrafficLight(int id) {
        this.id = id;
        this.color = "RED";
    }

    public void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else if (color.equals("YELLOW")) {
            color = "RED";
        }
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight(101);

        System.out.println("Current: " + light.getColor());

        light.next();
        System.out.println("Current: " + light.getColor());

        light.next();
        System.out.println("Current: " + light.getColor());

        light.next();
        System.out.println("Current: " + light.getColor());
    }
}