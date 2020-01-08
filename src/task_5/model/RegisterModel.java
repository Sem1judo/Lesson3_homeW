package task_5.model;

import task_5.model.entity.Register;
import task_5.model.entity.Student;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterModel<T> {

    private Register<Student> register = new Register<>();

    public void addStudent(String name, String surname, String phone, String address) {


        Student student = new Student();
        if (firstName(name)) {
            student.setFirstName(name);
        } else {
            System.out.println("Incorrect  first name");
        }
        if (lastName(surname)) {
            student.setLastName(surname);
        } else System.out.println("Incorrect last name");

        if (isValidMobileNumber(phone)) {
            student.setPhone(phone);
        } else System.out.println("Incorrect phone");

        if (validateAddress(address)) {
            student.setAddress(address);
        } else System.out.println("Incorrect address");

        register.getObj().add(student);
    }

    public static boolean firstName(String firstName) {
        return firstName.matches("[A-Z][a-z]*");
    }

    public static boolean lastName(String lastName) {
        return lastName.matches("[A-Z][a-z]*");
    }

    public static boolean isValidMobileNumber(String phone) {
        return (phone.matches("^\\+[\\(\\-]?(\\d[\\(\\)\\-]?){11}\\d$") ||

                phone.matches("^\\(?(\\d[\\-\\(\\)]?){9}\\d$")) &&

                phone.matches("[\\+]?\\d*(\\(\\d{3}\\))?\\d*\\-?\\d*\\-?\\d*\\d$");
    }


    public static boolean validateAddress(String address) {
        return address.matches(
                "^[#.0-9a-zA-Z\\s,-]+$");
    }

    public ArrayList<Student> printList() {
        return register.getObj();
    }

}
