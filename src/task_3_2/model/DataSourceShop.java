package task_3_2.model;

import task_3_2.model.entity.Shop;
import task_3_3.TypesOfGoods;

public class DataSourceShop {

    public static Shop.Department[] getArrayDepartmants() {
        Shop shop = new Shop();
        Shop.Department department1 = shop.new Department("Grocery","Milk", TypesOfGoods.DAIRY, "LeftArea");
        Shop.Department department2 = shop.new Department("Grocery","Kefir", TypesOfGoods.DAIRY, "LeftArea");
        Shop.Department department3 = shop.new Department("Grocery","Yoghurt", TypesOfGoods.DAIRY, "LeftArea");
        Shop.Department department4 = shop.new Department("Grocery","Cheese", TypesOfGoods.DAIRY, "LeftArea");
        Shop.Department department5 = shop.new Department("Grocery","Сurd", TypesOfGoods.DAIRY, "LeftArea");
        Shop.Department department6 = shop.new Department("Grocery","Pork", TypesOfGoods.MEAT, "RightArea");
        Shop.Department department7 = shop.new Department("Grocery","Chicken",  TypesOfGoods.MEAT, "RightArea");
        Shop.Department department8 = shop.new Department("Grocery","Veal",  TypesOfGoods.MEAT, "RightArea");
        Shop.Department department9 = shop.new Department("Grocery","Fish",  TypesOfGoods.MEAT, "RightArea");
        Shop.Department department10 = shop.new Department("Grocery","Dark Bread",  TypesOfGoods.BREAD, "UpArea");
        Shop.Department department11 = shop.new Department("Grocery","White Bread", TypesOfGoods.BREAD, "UpArea");
        Shop.Department department12 = shop.new Department("Grocery","Сake", TypesOfGoods.BREAD, "UpArea");
        Shop.Department department13 = shop.new Department("Grocery","Buckwheat", TypesOfGoods.GROATS, "DownArea");
        Shop.Department department14 = shop.new Department("Grocery","Rice", TypesOfGoods.GROATS, "DownArea");
        Shop.Department department15 = shop.new Department("Grocery","Corn", TypesOfGoods.GROATS, "DownArea");
        Shop.Department department16 = shop.new Department("Grocery","Oatmeal", TypesOfGoods.GROATS, "DownArea");

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
