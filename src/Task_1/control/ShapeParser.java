package Task_1.control;

import Task_1.model.entity.Circle;
import Task_1.model.entity.Shape;
import Task_1.model.entity.ShapeType;

public class ShapeParser {
    public static Shape parse(String shape) {
        String type = shape.substring(0, shape.indexOf(":")).toUpperCase();
        switch (ShapeType.valueOf(type)) {

            case CIRCLE:
                return Circle.parseShape(shape);
            default:
                return null;

        }
    }
}
