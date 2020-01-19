package task_2.control;

import task_2.model.BookModel;
import task_2.view.BooksView;
import task_2.view.InputData;

import java.io.IOException;

public class BookController {

    private BookModel model = new BookModel();
    private BooksView view = new BooksView();

    public void run() throws IOException, ClassNotFoundException {

        view.viewData(ConvertToString.convertArray(model.getBooks()));

        view.viewData("Enter what you want to look up -> exist: search by author, publisher or search by year");
        String specific = InputData.input();

        if (specific.matches("[-+]?\\d+")) {
            int year = Integer.parseInt(specific);
            view.viewData(ConvertToString.convertArray(model.sortBook(model.getSpecificBooktillYear(year))));
        } else {
            view.viewData(ConvertToString.convertArray(model.sortBook(model.getSpecificBook(specific))));
        }
        view.viewData("Saving data from Books");
        view.viewData(ConvertToString.convertArray(model.createFileBooks(model.getBooks())));

    }
}
