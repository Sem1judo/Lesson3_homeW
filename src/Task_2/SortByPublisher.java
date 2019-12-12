package Task_2;

import Task_2.model.entity.Book;

import java.util.Comparator;

public class SortByPublisher implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String b1 = ((Book) o1).getPublisher();
        String b2 = ((Book) o2).getPublisher();
        return b1.compareTo(b2);
    }
}
