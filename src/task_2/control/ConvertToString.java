package task_2.control;

import task_2.model.entity.Book;

public class ConvertToString {
    public static String convertArray(Book[] books) {
        String res = "";
        for (Book elem : books) {
            res += elem.toString();
        }
        return res;
    }

}
