package task_1.model.entity;

public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle(String colorShape, double w, double h) {
        super(colorShape);
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width = " + w + ", height = " + h;
    }

    @Override
    public double calcArea() {
        return w * h;
    }

    @Override
    public String draw() {
        return super.draw();
    }
}
