package task_3.Model.Entity;

public class Toy {
    private String name;
    private String material;
    private double price;


    public Toy() {
    }

    public Toy(String name, String material, double price, double weight) {
        this.name = name;
        this.material = material;
        this.price = price;
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
        return "Toy: " + "name=" + name + ", material=" + material+ ", price=" + price;

    }
}
