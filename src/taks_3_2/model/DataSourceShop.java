package taks_3_2.model;

import taks_3_2.model.entity.Shop;

public class DataSourceShop {

    public static Shop.Department[] getArrayDepartmants() {
        Shop shop = new Shop();
        Shop.Department department1 = shop.new Department("Grocery","Milk", "Dairy", "LeftArea");
        Shop.Department department2 = shop.new Department("Grocery","Kefir", "Dairy", "LeftArea");
        Shop.Department department3 = shop.new Department("Grocery","Yoghurt", "Dairy", "LeftArea");
        Shop.Department department4 = shop.new Department("Grocery","Cheese", "Dairy", "LeftArea");
        Shop.Department department5 = shop.new Department("Grocery","Сurd", "Dairy", "LeftArea");
        Shop.Department department6 = shop.new Department("Grocery","Pork", "Meat", "RightArea");
        Shop.Department department7 = shop.new Department("Grocery","Chicken", "Meat", "RightArea");
        Shop.Department department8 = shop.new Department("Grocery","Veal", "Meat", "RightArea");
        Shop.Department department9 = shop.new Department("Grocery","Fish", "Meat", "RightArea");
        Shop.Department department10 = shop.new Department("Grocery","Dark Bread", "Bread", "UpArea");
        Shop.Department department11 = shop.new Department("Grocery","White Bread", "Bread", "UpArea");
        Shop.Department department12 = shop.new Department("Grocery","Сake", "Bread", "UpArea");
        Shop.Department department13 = shop.new Department("Grocery","Buckwheat", "Groats", "DownArea");
        Shop.Department department14 = shop.new Department("Grocery","Rice", "Groats", "DownArea");
        Shop.Department department15 = shop.new Department("Grocery","Corn", "Groats", "DownArea");
        Shop.Department department16 = shop.new Department("Grocery","Oatmeal", "Groats", "DownArea");

        shop.add(shop.getDepartments().length, department1);
        shop.add(shop.getDepartments().length, department2);
        shop.add(shop.getDepartments().length, department3);
        shop.add(shop.getDepartments().length, department4);
        shop.add(shop.getDepartments().length, department5);
        shop.add(shop.getDepartments().length, department6);
        shop.add(shop.getDepartments().length, department7);
        shop.add(shop.getDepartments().length, department8);
        shop.add(shop.getDepartments().length, department9);
        shop.add(shop.getDepartments().length, department10);
        shop.add(shop.getDepartments().length, department11);
        shop.add(shop.getDepartments().length, department12);
        shop.add(shop.getDepartments().length, department13);
        shop.add(shop.getDepartments().length, department14);
        shop.add(shop.getDepartments().length, department15);
        shop.add(shop.getDepartments().length, department16);


        return shop.getDepartments();
    }
}
