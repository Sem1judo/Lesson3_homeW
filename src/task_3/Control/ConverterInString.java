package task_3.Control;

import task_3.Model.Entity.Toy;

public class ConverterInString {
    public static String convertArrayGameRoom(Toy[] shapes) {
        String res = "";
        for (Toy elem : shapes) {
            res += elem.toString();
        }
        return res;
    }

    public static String convertDouble(double value, String message){
        return String.format("%s = %.2f\n",message, value);
    }


}
