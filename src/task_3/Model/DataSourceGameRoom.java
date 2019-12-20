package task_3.Model;

import task_3.Model.Entity.GameRoom;
import task_3.Model.Entity.Toy;

public class DataSourceGameRoom {

    public static Toy[] getArrayToys() {
        GameRoom<Toy> toyGameRoom = new GameRoom<>();
        Toy toy = new Toy("Rabbit", "silk", 50.5, 10);
        Toy toy2 = new Toy("Cow", "silk", 220, 45);
        Toy toy3 = new Toy("Phone", "plastic", 40, 3);
        Toy toy4 = new Toy("Car", "iron", 100.90, 15);
        Toy toy5 = new Toy("Doll", "silk", 30.52, 20);
        Toy toy6 = new Toy("Cup", "iron", 56.51, 8);
        Toy toy7 = new Toy("Elephant", "silk", 80.52, 4);
        Toy toy8 = new Toy("Giraffe", "silk", 90.21, 30);
        Toy toy9 = new Toy("Unicorn", "silk", 150.50, 10);
        Toy toy10 = new Toy("Сonstructor", "plastic", 99.99, 33);
        Toy toy11 = new Toy("Rabbit", "silk", 1000.99, 50);
        Toy toy12 = new Toy("Phone", "silk", 99.99, 20);
        Toy toy13 = new Toy("Rabbit", "plastic", 50.5, 10);
        Toy toy14 = new Toy("Rabbit", "plastic", 350.4, 25);
        Toy toy15 = new Toy("Cow", "silk", 70, 10);
        Toy toy16 = new Toy("Cow", "silk", 100, 24.5);


        toyGameRoom.add(toyGameRoom.getToys().length, toy);
        toyGameRoom.add(toyGameRoom.getToys().length, toy2);
        toyGameRoom.add(toyGameRoom.getToys().length, toy3);
        toyGameRoom.add(toyGameRoom.getToys().length, toy4);
        toyGameRoom.add(toyGameRoom.getToys().length, toy5);
        toyGameRoom.add(toyGameRoom.getToys().length, toy6);
        toyGameRoom.add(toyGameRoom.getToys().length, toy7);
        toyGameRoom.add(toyGameRoom.getToys().length, toy8);
        toyGameRoom.add(toyGameRoom.getToys().length, toy9);
        toyGameRoom.add(toyGameRoom.getToys().length, toy10);
        toyGameRoom.add(toyGameRoom.getToys().length, toy11);
        toyGameRoom.add(toyGameRoom.getToys().length, toy12);
        toyGameRoom.add(toyGameRoom.getToys().length, toy13);
        toyGameRoom.add(toyGameRoom.getToys().length, toy14);
        toyGameRoom.add(toyGameRoom.getToys().length, toy15);
        toyGameRoom.add(toyGameRoom.getToys().length, toy16);

        return toyGameRoom.getToys();
    }
}
