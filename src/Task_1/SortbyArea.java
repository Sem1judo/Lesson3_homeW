package Task_1;

import Task_1.model.entity.Shape;

import java.util.Comparator;

public class SortbyArea implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return (int) (shape1.calcArea() -shape2.calcArea());
    }
}
