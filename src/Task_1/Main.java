package Task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle("YELLOW", 6, 2);
        Shape[] shapes = {new Rectangle("GREEN", 10, 5),
                new Rectangle("BLUE", 8, 4),
                shape,
                new Rectangle("WHITE", 9, 6),
                new Triangle("DARK", 10, 7),
                new Triangle("ORANGE", 6, 4),
                new Triangle("PURPLE", 7, 3),
                new Circle("RED", 2),
                new Circle("GREY", 3.4),
                new Circle("BLACK", 5),
                new Circle("BROWN", 1.5)
        };
        //1
        shape.printShapes(shapes);
        //2
        System.out.printf("Sum areas: %1.2f\n", shape.AreaOfAllShapes(shapes));
        // 3
        shape.areaOfSpecificShapes(shapes);
        // 4
        Arrays.sort(shapes, new SortbyArea());
        System.out.println("Sort by area ");
        shape.printShapes(shapes);
        // 5
        Arrays.sort(shapes, new SortByColor());
        System.out.println("Sort by color ");
        shape.printShapes(shapes);


    }
}
