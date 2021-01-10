package democollectionssss;

import java.util.PriorityQueue;

public class LinkedDemo {

    public static void main(String[] args) {

        PriorityQueue<String> list = new PriorityQueue<>();

        list.offer("aaaa");
        list.offer("bbbbbbb");
        list.offer("cccccc");
        list.offer("ffffffffff");

        String peek = list.peek();//lay ra 1 phan tu dc push dau tien
        System.out.println(peek);
        String pop = list.poll();//lay ra 1 phan tu dc push dau tien, va xoa luon phan tu do
        System.out.println(pop);
        pop = list.poll();//lay ra 1 phan tu dc push dau tien, va xoa luon phan tu do
        System.out.println(pop);

    }
}
