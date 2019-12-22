package task_3_2.control;


import task_3_2.model.ShopModel;
import task_3_2.model.entity.Shop;
import task_3_2.view.InputData;
import task_3_2.view.ShopView;

import java.util.Comparator;

public class ShopController {

    ShopModel shopModel = new ShopModel();
    ShopView shopView = new ShopView();

    public void run() {

        shopView.viewData(ConvertToString.convertArrayDepartments(shopModel.getDepartments()));
        shopView.viewData("--------------------------");
        shopView.viewData("Please enter which Kind of product do you seek");
        String typeOfGoods = InputData.input();
        shopView.viewData(ConvertToString.convertArrayDepartments(shopModel.sortOfDepartmentInShop(typeOfGoods)));
        shopView.viewData("--------------------------");
        shopView.viewData(ConvertToString.convertArrayDepartments(shopModel.sortDepartmentByName(new Comparator<Shop.Department>() {
            public int compare(Shop.Department o1, Shop.Department o2) {
                String s1 = o1.getNameProduct();
                String s2 = o2.getNameProduct();
                return (s1.compareTo(s2));
            }
        })));


    }


}
