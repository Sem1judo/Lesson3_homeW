package task_1.control;

import task_1.model.entity.Shape;

public class ConverterInString {
    public static String convertArrayShapes(Shape[] shapes) {
        String res = "";
        for (Shape elem : shapes) {
            res += elem.draw();
        }
        return res;
    }

    public static String convertDouble(double value, String message){
        return String.format("%s = %.2f\n",message, value);
    }

}
