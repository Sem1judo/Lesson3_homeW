package task_3.Model.Entity;


import java.util.*;

public class GameRoom<T> {

    private Toy[] toys = new Toy[0];


    public GameRoom() {
    }

    public Toy[] add(int n, Toy toy) {

        Toy[] old = toys;
        toys = new Toy[n + 1];

        for (int i = 0; i < n; i++) {
            toys[i] = old[i];
        }
        toys[n] = toy;

        return toys;
    }

    public double average() {
        double sum = 0.0;
        for (Toy toy : toys) {
            sum += toy.getPrice();
        }
        return sum;


    }



    public static void main(String[] args) {


        GameRoom<Toy> toyGameRoom = new GameRoom<>();
        Toy toy = new Toy("Rabbit", "silk", 50.5, 10);
        Toy toy2 = new Toy("Cow", "silk", 70, 10);
        Toy toy3 = new Toy("Phone", "plastic", 40, 3);
        Toy toy4 = new Toy("Car", "iron", 100.90, 15);
        Toy toy5 = new Toy("Doll", "silk", 30.52, 20);
        Toy toy6 = new Toy("Cup", "iron", 56.51, 8);
        Toy toy7 = new Toy("Elephant", "silk", 80.52, 4);
        Toy toy8 = new Toy("Giraffe", "silk", 90.21, 30);
        Toy toy9 = new Toy("Unicorn", "silk", 150.50, 10);
        Toy toy10 = new Toy("Сonstructor", "plastic", 99.99, 50);

        toyGameRoom.add(toyGameRoom.toys.length, toy);
        toyGameRoom.add(toyGameRoom.toys.length, toy2);
        toyGameRoom.add(toyGameRoom.toys.length, toy3);
        toyGameRoom.add(toyGameRoom.toys.length, toy4);
        toyGameRoom.add(toyGameRoom.toys.length, toy5);
        toyGameRoom.add(toyGameRoom.toys.length, toy6);
        toyGameRoom.add(toyGameRoom.toys.length, toy7);
        toyGameRoom.add(toyGameRoom.toys.length, toy8);
        toyGameRoom.add(toyGameRoom.toys.length, toy9);
        toyGameRoom.add(toyGameRoom.toys.length, toy10);


        System.out.println(Arrays.toString(toyGameRoom.toys));


    }

}

//    public int SortByMaterial(T t1, T t2) {
//        return t1. ().compareTo(t2.getMaterial());
//    }
//
//    public int SortByPrice(T t1, T t2) {
//        return (int) (getPrice() - getPrice());
//
//    }



