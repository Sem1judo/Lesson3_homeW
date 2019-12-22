package task_3.Model.Entity;


public class GameRoom<T> {

    private Toy[] toys = new Toy[0];

    public Toy[] getToys() {
        return toys;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }

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


}



