package Task_2.control;

import Task_1.control.ConverterInString;
import Task_2.model.BookModel;
import Task_2.view.BooksView;
import Task_2.view.InputData;

import java.util.Comparator;

public class BookController {

    private BookModel model = new BookModel();
    private BooksView view = new BooksView();

    public void run() {

        view.viewData(ConvertToString.convertArray(model.getBooks()));

        view.viewData("Enter what you want to look up -> exist: search by author, publisher or search by year");
        String specific = InputData.input();

         if (specific.matches("[-+]?\\d+")) {
            int year = Integer.parseInt(specific);
            view.viewData(ConvertToString.convertArray(model.sortBook(model.getSpecificBooktillYear(year))));
        } else {
            view.viewData(ConvertToString.convertArray(model.sortBook(model.getSpecificBook(specific))));
        }
    }
}
