package task_3.Control;


import task_3.Model.DataSourceGameRoom;
import task_3.Model.Entity.GameRoom;
import task_3.Model.Entity.Toy;
import task_3.Model.GameRoomModel;
import task_3.View.GameRoomView;

import java.util.Arrays;
import java.util.Comparator;

public class GameRoomController {

    private GameRoomModel model = new GameRoomModel();
    private GameRoomView view = new GameRoomView();

    public void run() {

        view.viewData(ConverterInString.convertArrayGameRoom(model.getToys()));
        view.viewData(ConverterInString.convertDouble(model.sumOfToys(model.getToys()), "Total sum of toys"));
        view.viewData("--------------------------");
        view.viewData(ConverterInString.convertArrayGameRoom(model.sortToy(new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        })));


    }


}
