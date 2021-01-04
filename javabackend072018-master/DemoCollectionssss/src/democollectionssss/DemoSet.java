package democollectionssss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

    public static void main(String[] args) {

        Set set = new HashSet();
        set.add("aaaaaaa");
        set.add("aaaaaaa");
        set.add("aaaaaaa");
        set.add("aaaaaaa");
        set.add("aaaaaae4");

        for (Object object : set) {
            System.out.println(object);
        }

        set.forEach((Object t) -> {
        });
        //itor
        Iterator iterator = set.iterator();//co kha nang tro toi tung phan tu callection
        while (true) {
            if (iterator.hasNext()) {

                Object next = iterator.next();//lay ra phan tu dau tien
            } else {
                break;
            }

        }

        Set<SinhVien> setSinhVien = new TreeSet<>();
//        Set<SinhVien> setSinhVien = new HashSet<>();
        setSinhVien.add(new SinhVien(1, "SADSA Á "));
        setSinhVien.add(new SinhVien(1, "SADSA Á "));
        setSinhVien.add(new SinhVien(1, "SADSA Á "));
        setSinhVien.add(new SinhVien(1, "SADSA Á "));

//        for (SinhVien sinhVien : setSinhVien) {
//
//        }
        Iterator<SinhVien> itSv = setSinhVien.iterator();

        while (true) {
            if (itSv.hasNext()) {
                SinhVien next = itSv.next();
                System.out.println(next);
            } else {

                break;
            }
        }
    }

}
