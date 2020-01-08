package task_5_2;

public class run {

    public static void main(String[] args) {

        NewHashSet<Integer> set = new NewHashSet<>();
        NewList<String> list = new NewList<>();


        list.add("aaaa");
        list.add("bbbb");
        list.add("ddddddd");
        list.add("adads");


        System.out.println(list.get(2));
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.get(2));
        System.out.println("Elements in list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());


        set.add(22);
        set.add(11);
        set.add(22);
        set.add(5);
        set.add(12);
        set.add(999);
        System.out.println("Size of set " + set.getSize());

    }
}
