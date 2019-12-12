package Task_1.control;

import Task_1.SortByColor;
import Task_1.SortbyArea;
import Task_1.model.ShapeModel;
import Task_1.model.entity.Shape;
import Task_1.view.InputData;
import Task_1.view.ShapeView;

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
                comparator = new SortbyArea();
                break;
            }
            case "color": {
                comparator = new SortByColor();
                break;
            }
        }

        if (comparator != null) {
            view.viewData(ConverterInString.convertArrayShapes(model.sortShape(comparator)));
        } else {view.viewData("Invalid criteria");}


    }
}
