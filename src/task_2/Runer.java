package task_2;

import task_2.control.BookController;

import java.io.IOException;

public class Runer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        new BookController().run();

    }
}
