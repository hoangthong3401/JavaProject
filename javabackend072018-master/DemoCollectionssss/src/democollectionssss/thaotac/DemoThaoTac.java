package democollectionssss.thaotac;

import democollectionssss.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoThaoTac {

    public static void main(String[] args) {

        List<SinhVien> list = new ArrayList<>();

        list.add(new SinhVien(1, "aaaaaaaa"));
        list.add(new SinhVien(2, "bbbbbb"));
        list.add(new SinhVien(3, "nnnnnnnnn"));
        list.add(new SinhVien(5, "abbbaa"));
        list.add(new SinhVien(4, "xxxx"));

        Collections.sort(list, (SinhVien o1, SinhVien o2) -> o1.getTen().compareTo(o2.getTen()));

//        Collections.
        list.forEach(System.out::println);
    }

}
