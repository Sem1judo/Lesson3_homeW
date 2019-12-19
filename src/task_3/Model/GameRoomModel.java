package task_3.Model;

import task_3.Model.Entity.GameRoom;
import task_3.Model.Entity.Toy;

import java.util.Arrays;
import java.util.Comparator;

public class GameRoomModel {
    private Toy[] toys;

    public GameRoomModel() {
        toys = DataSourceGameRoom.getArrayToys();
    }

    public Toy[] getToys() {
        return toys;
    }

//    public Toy rangeOfParametersInToys(String field, String field2){
//        Toy[] toys1 = null;
//        Toy toy = null;
//        for (Toy toy: toys){
//            if (toy.getMaterial().equalsIgnoreCase(field) && toy.getName().equalsIgnoreCase(field2)){
//                toy.
//            }
//        }
//
//    }


    public double sumOfToys(Toy[] toys) {
        int sum = 0;
        for (Toy toy1 : toys) {
            sum += toy1.getPrice();
        }
        return sum;
    }



    public  Toy[] sortToy(Comparator comparator) {
        Toy[] newArr = Arrays.copyOf(DataSourceGameRoom.getArrayToys(), DataSourceGameRoom.getArrayToys().length);
        Arrays.sort(newArr, comparator);
        return newArr;
    }


}
