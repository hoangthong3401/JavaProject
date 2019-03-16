package version1;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Household implements iHousehold, Serializable {

    private final int N_MEMBERS;
    private final String HOUSE_NUMBER;
    private List<Member> lsMembers;

    public Household(String houseNumber, List<Member> lsMembers) {
        this.HOUSE_NUMBER = houseNumber;
        this.lsMembers = lsMembers;
        this.N_MEMBERS = lsMembers.size();
    }

    public int getN_MEMBERS() {
        return N_MEMBERS;
    }

    public String getHouseNumber() {
        return HOUSE_NUMBER;
    }

    public List<Member> getLsMembers() {
        return lsMembers;
    }

    public void setLsMembers(List<Member> lsMembers) {
        this.lsMembers = lsMembers;
    }

    @Override
    public String toString() {
        return "Household{" + "Number of members is " + N_MEMBERS
                + ", House Number (ID) is " + HOUSE_NUMBER + '}';
    }

    @Override
    public void input() {
        System.out.print("Number of members? - ");
        int n = 0;
        try {
            n = Integer.parseInt(new Scanner(System.in).nextLine());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        for (int i = 0; i < n; i++) {
            Member ob = new Member();
            ob.inputInfo();
            lsMembers.add(ob);
        }
    }

    @Override
    public void find() {
        lsMembers.stream().forEach((Member t) -> {
            if (t.isMoreThan80YearOld()) {
                System.out.println(Household.this.toString());
            }
        });
    }

    @Override
    public void show() {
        System.out.println(this);
        lsMembers.forEach(Member::displayInfo);
    }
}
