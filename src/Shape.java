import java.util.Comparator;
import java.util.Scanner;

public abstract class Shape implements Drawable{
    private String colorShape;



    public Shape(String colorShape) {
        this.colorShape = colorShape;
    }

    public String getColorShape() {
        return colorShape;
    }

    public void setColorShape(String colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": colorShape = " + colorShape;
    }


    public void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public double AreaOfAllShapes(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calcArea();
        }
        return sum;
    }

    public void areaOfSpecificShapes(Shape[] shapes) {
        double sum = 0;
        System.out.println("Please enter your shape: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case "circle":
                for (Shape shape : shapes)
                    if (shape instanceof Circle) {
                        sum += shape.calcArea();
                    }
                System.out.printf("Sum of circle: %5.2f\n",sum);
                break;
            case "triangle":
                for (Shape shape : shapes)
                    if (shape instanceof Triangle) {
                        sum += shape.calcArea();
                    }
                System.out.printf("Sum of triangle: %5.2f\n",sum);
                break;
            case "rectangle":
                for (Shape shape : shapes)
                    if (shape instanceof Rectangle) {
                        sum += shape.calcArea();
                    }
                System.out.printf("Sum of rectangle: %5.2f\n",sum);
                break;
            default:
                System.out.println("No such a shape");
                break;

        }
    }

    public abstract double calcArea();
}
