package Task_1.model.entity;

public class Circle extends Shape {
    private double r;

    public Circle(String colorShape, double r) {
        super(colorShape);
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI * r * r;
    }

    @Override
    public String draw() {
        return super.draw();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius = " + r;
    }

    public static Circle parseShape(String data) {
        String[] tokens = data.split("[;,]");
        return new Circle(tokens[1],
                Double.parseDouble(tokens[2]));
    }
}
