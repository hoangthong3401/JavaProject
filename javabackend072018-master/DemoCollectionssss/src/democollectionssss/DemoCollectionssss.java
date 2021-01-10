package democollectionssss;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoCollectionssss {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("aaaaa");
        list.add("aaaaa");
        list.add("676756");
        list.add("aaaaa");
        list.add("aaaaa");
        list.add("aaaaa");
        list.add(45);
        list.add(44.5);

        for (int i = 0; i < list.size(); i++) {
            Object get = list.get(i);
            if (get instanceof String) {
                String s = (String) get;
                System.out.println("s = " + s);
            } else {
                System.out.println(get);
            }

        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        list.forEach((Object t) -> {
            System.out.println("a = " + t.toString());
        });
        //list se lay ra tung phan tu trong mang, sau do goi accept chay và truyen vào phan tu do
        //danh dau cho lisst ( set...) chi nhan vao 1 kieu du lieu tuong ung

        List<String> strings = new ArrayList<>();
        strings.add("sdsadsad");
        strings.add("sdsadsad");
        strings.add("sdsadsad");
        strings.forEach((string) -> {
            System.out.println(string);
        });//        strings.add(45);

    }

}
