package task_5.control;


import task_5.model.entity.Register;
import task_5.model.entity.Student;

import java.util.ArrayList;

public class ConverterInString {
    public static String convertArrayListStudents(ArrayList<Student> students) {
        String res = "";
        for (Student elem : students) {
            res += elem.toString();
        }
        return res;
    }


}
