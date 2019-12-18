package task_3.Model;

import task_3.Model.Entity.GameRoom;
import task_3.Model.Entity.Toy;

import java.util.Arrays;
import java.util.Comparator;

public class GameRoomModel {



    public static double sumOfToys(Toy[] toys) {
        int sum = 0;
        for (Toy toy1 : toys) {
            sum += toy1.getPrice();
        }
        return sum;
    }
    public static Toy[] sortToy(Comparator comparator) {
        Toy[] newArr = Arrays.copyOf(DataSourceGameRoom.getArrayToys(), DataSourceGameRoom.getArrayToys().length);
        Arrays.sort(newArr, comparator);
        return newArr;
    }
}
