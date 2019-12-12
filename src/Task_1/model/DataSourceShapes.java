package Task_1.model;

import Task_1.model.entity.Circle;
import Task_1.model.entity.Rectangle;
import Task_1.model.entity.Shape;
import Task_1.model.entity.Triangle;

public class DataSourceShapes {

    public static Shape[] getArrayShapes() {

        return new Shape[]{new Rectangle("GREEN", 10, 5),
                new Rectangle("BLUE", 8, 4),
                new Rectangle("WHITE", 9, 6),
                new Triangle("DARK", 10, 7),
                new Triangle("ORANGE", 6, 4),
                new Triangle("PURPLE", 7, 3),
                new Circle("RED", 2),
                new Circle("GREY", 3.4),
                new Circle("BLACK", 5),
                new Circle("BROWN", 1.5)
        };
    }
}
