package task_3.Model.Entity;

public class Toy {
    private String name;
    private String material;
    private double price;
    private double weight;


    public Toy() {
    }

    public Toy(String name, String material, double price, double weight) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy: " + "name=" + name + ", material=" + material+ ", weight=" + weight +", price=" + price+ " | ";

    }
}
