import java.util.Comparator;

public class SortByColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String shape1 = ((Shape) o1).getColorShape();
        String shape2 = ((Shape) o2).getColorShape();
        return shape1.compareTo(shape2);
    }
}
