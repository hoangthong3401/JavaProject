
package demoenum;


public enum Weekdays {
    MON(0, "Monday"), TUE(1, "Tuesday"), WED(2, "Wednesday"), THU(3, "Thursday"), FRI(4, "Friday"), SAT(5, "Saturday");

    private Weekdays(int index, String name) {
        this.index = index;
        this.name = name;
    }

    private int index;
    private String name;

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}
