package taks_3_2.model;

import taks_3_2.model.entity.*;

import java.util.Arrays;
import java.util.Comparator;


public class ShopModel {
    private Shop.Department[] departments;

    public ShopModel() {
        departments = DataSourceShop.getArrayDepartmants();
    }

    public Shop.Department[] getDepartments() {
        return departments;
    }


    public Shop.Department[] sortOfDepartment(String field) {
        Shop sortDepartment = new Shop();
        for (Shop.Department departments : departments) {
            if (departments.getTypeOfGoods().equalsIgnoreCase(field)) {
                sortDepartment.add(sortDepartment.getDepartments().length, departments);
            }
        }
        return sortDepartment.getDepartments();
    }

    public Shop.Department[] sortDepartment(Comparator comparator) {
        Shop.Department[] newArr = Arrays.copyOf(departments, departments.length);
        Arrays.sort(newArr, comparator);
        return newArr;

    }
}

