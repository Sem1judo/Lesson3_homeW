package task_3.Model;

import task_3.Model.Entity.Toy;

public class GameRoomControler {

    public int SortByMaterial(Toy t1, Toy t2) {
        return t1.getMaterial().compareTo(t2.getMaterial());
    }

    public int SortByPrice(Toy t1, Toy t2) {
        return (int) (t1.getPrice() - t2.getPrice());
    }

    public double sumOfToys(Toy[] toys) {
        int sum = 0;
        for (Toy toy1 : toys) {
            sum += toy1.getPrice();
        }
        return sum;
    }
}
