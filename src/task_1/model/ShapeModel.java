package task_1.model;

import task_1.model.entity.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeModel {
    private Shape[] shapes;

    public ShapeModel() {
        shapes = DataSourceShapes.getArrayShapes();
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public  double getTotalAreaShapes() {
        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.calcArea();
        }
        return sum;
    }

    public  double getAreaShapesByType( String type) {
        double sum = 0.0;
        for (Shape shape : shapes) {
            if (shape.getClass().getSimpleName().equalsIgnoreCase(type))
                sum += shape.calcArea();
        }
        return sum;
    }

    public  Shape[] sortShape(Comparator comparator) {
        Shape[] newShapes = Arrays.copyOf(shapes, shapes.length);
        Arrays.sort(newShapes, comparator);
        return newShapes;

    }


}
