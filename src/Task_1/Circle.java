package Task_1;

public class Circle extends Shape {
    private double r;

    public Circle(String colorShape,  double r) {
        super(colorShape);
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI*r*r;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area=%.2f\n", this, calcArea());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius = " + r ;
    }
}
