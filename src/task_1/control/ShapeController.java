package task_1.control;

import task_1.model.ShapeModel;
import task_1.model.entity.Shape;
import task_1.view.InputData;
import task_1.view.ShapeView;

import java.util.Comparator;

public class ShapeController {

    private ShapeModel model = new ShapeModel();
    private ShapeView view = new ShapeView();

    public void run() {

        view.viewData(ConverterInString.convertArrayShapes(model.getShapes()));

        view.viewData(ConverterInString.convertDouble(model.getTotalAreaShapes(), "Total area"));

        view.viewData("Enter type Shape ->");
        String type = InputData.input();
        view.viewData(ConverterInString.convertDouble(model.getAreaShapesByType(type), type + " area"));

        view.viewData("--------------------------");
        view.viewData("Enter criteria sorting(area, color) -> \n");
        String criteria = InputData.input().toLowerCase();
        Comparator comparator = null;
        switch (criteria) {
            case "area": {
                comparator = (o1, o2) -> {
                    Shape shape1 = (Shape) o1;
                    Shape shape2 = (Shape) o2;
                    return (int) (shape1.calcArea() - shape2.calcArea());
                };
                break;
            }
            case "color": {
                comparator = new Comparator<Shape>() {
                    @Override
                    public int compare(Shape o1, Shape o2) {
                        return o1.getColorShape().compareTo(o2.getColorShape());
                    }
                };
                break;
            }
        }

        if (comparator != null) {
            view.viewData(ConverterInString.convertArrayShapes(model.sortShape(comparator)));
        } else {
            view.viewData("Invalid criteria");
        }


    }
}
