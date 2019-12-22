package task_3_2.control;

import task_3_2.model.entity.Shop;

public class ConvertToString {

    public static String convertArrayDepartments(Shop.Department[] arr) {
        String str = "";
        for (Shop.Department shop : arr) {
            str += shop.toString();

        }
        return str;
    }
}
