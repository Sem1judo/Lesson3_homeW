package task_5.control;

import javafx.scene.layout.VBox;
import task_5.model.RegisterModel;
import task_5.view.RegisterView;

import java.util.Scanner;

public class RegisterController {

    private RegisterModel model = new RegisterModel();
    private RegisterView view = new RegisterView();
    private static Scanner scan = new Scanner(System.in);

    public void run() {

        view.view("Please input first name: ");
        String name = scan.next();
        view.view("Please input last name: ");
        String lastName = scan.next();
        view.view("Please input phone: ");
        String phone = scan.next();
        view.view("Please input address: ");
        String address = scan.next();
        model.addStudent(name, lastName, phone, address);

        view.view(ConverterInString.convertArrayListStudents(model.printList()));
        view.view("---------------------------------------");

        view.view("Please input first name: ");
        String name1 = scan.next();
        view.view("Please input last name: ");
        String lastName1 = scan.next();
        view.view("Please input phone: ");
        String phone1 = scan.next();
        view.view("Please input address: ");
        String address1 = scan.next();
        model.addStudent(name1, lastName1, phone1, address1);
        view.view(ConverterInString.convertArrayListStudents(model.printList()));

    }

}
