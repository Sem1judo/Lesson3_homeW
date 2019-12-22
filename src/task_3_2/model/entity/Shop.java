package task_3_2.model.entity;

import task_3_3.TypesOfGoods;

import java.util.Arrays;

public class Shop {
    private Department[] departments = new Department[0];


    public class Department {
        private String name;
        private String nameProduct;
        private TypesOfGoods typeOfGoods;
        private String place;

        public Department() {
        }

        public Department(String name, String nameProduct, TypesOfGoods TypesOfGoods, String place) {
            this.name = name;
            this.nameProduct = nameProduct;
            this.typeOfGoods = typeOfGoods;
            this.place = place;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.nameProduct = nameProduct;
        }

        public TypesOfGoods getTypeOfGoods() {
            return typeOfGoods;
        }

        public void setTypeOfGoods(TypesOfGoods typeOfGoods) {
            this.typeOfGoods = typeOfGoods;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        @Override
        public String toString() {
            return "Department:" +  "name=" + name + ", nameProduct=" + nameProduct + ", typeOfGoods=" + typeOfGoods + ", place=" + place + ". ";
        }
    }

    public Shop() {
    }

    public Shop(Department[] departments) {
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Department[] add(int n, Department department) {

        Department[] old = departments;
        departments = new Department[n + 1];

        for (int i = 0; i < n; i++) {
            departments[i] = old[i];
        }
        departments[n] = department;

        return departments;
    }

    public Department[] deleteDepartment(int n, int index) {

        if (departments == null
                || index < 0
                || index >= departments.length) {

            return departments;
        }

        Department[] old = departments;
        departments = new Department[n - 1];

        for (int i = 0, k = 0; i < departments.length; i++) {
            if (i == index) {
                continue;
            }
            departments[k++] = departments[i];
        }

        return departments;
    }



    @Override
    public String toString() {
        return "Shop[" + "departments= " + Arrays.toString(departments) + " ]";
    }
}
