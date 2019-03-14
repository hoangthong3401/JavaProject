package version1;

import java.util.List;
import java.util.Scanner;

public class Household implements iHousehold {

    private final int N_MEMBERS;
    private final String HOUSE_NUMBER;
    private List<Member> lsMembers;

    public Household(String houseNumber, List<Member> lsMembers) {
        this.HOUSE_NUMBER = houseNumber;
        this.N_MEMBERS = lsMembers.size();
        this.lsMembers = lsMembers;
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
        return "Household{" + "N_MEMBERS=" + N_MEMBERS + ", houseNumber=" + HOUSE_NUMBER + '}';
    }

    @Override
    public void input() {
        System.out.print("Number of members? - ");
        int n = new Scanner(System.in).nextInt();
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
}
