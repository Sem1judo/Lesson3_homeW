package task_1.model.entity;

public class Triangle extends Shape {

    private  double base;
    private  double height;

    public Triangle(String colorShape, double base, double height) {
        super(colorShape);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (base * height) / 2;
    }

    @Override
    public String draw() {
        return super.draw();

    }

    @Override
    public String toString() {
        return super.toString() +
                ", base = " + base + ", height = " + height;
    }
}
