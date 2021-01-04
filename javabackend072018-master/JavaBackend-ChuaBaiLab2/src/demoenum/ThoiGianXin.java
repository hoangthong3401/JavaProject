/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoenum;

/**
 *
 * @author Admin
 */
public class ThoiGianXin {

    private static Weekdays thu;

    public Weekdays getThu() {
        return thu;
    }

    public static void setThu(Weekdays thu) {
        ThoiGianXin.thu = thu;
    }

    public static void main(String[] args) {
        ThoiGianXin tgx = new ThoiGianXin();
        ThoiGianXin.setThu(Weekdays.MON);
        System.out.println("English name = " + thu.getName());
    }
}
