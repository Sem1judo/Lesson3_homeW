package task_3_3;

public enum TypesOfGoods {
    MEAT("Meat"), DAIRY("Dairy"), BREAD("Bread"), GROATS("Groats");

    private final String type;

    TypesOfGoods(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
