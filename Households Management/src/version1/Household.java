package version1;

import java.util.List;
import java.util.Scanner;

public class Household implements iHousehold {

    private int nMembers;
    private String houseNumber;
    private List<Member> lsMembers;

    public Household() {

    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Household(int nMembers, String houseNumber, List<Member> lsMembers) {
        super();
        this.nMembers = nMembers;
        this.lsMembers = lsMembers;
    }

    public int getnMembers() {
        return nMembers;
    }

    public void setnMembers(int nMembers) {
        this.nMembers = nMembers;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public List<Member> getLsMembers() {
        return lsMembers;
    }

    public void setLsMembers(List<Member> lsMembers) {
        this.lsMembers = lsMembers;
    }

    @Override
    public String toString() {
        return "Household{" + "nMembers=" + nMembers + ", houseNumber=" + houseNumber + '}';
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
        lsMembers.forEach((Member member) -> {
            if (member.isMoreThan80YearOld()) {
                System.out.println(Household.this.toString());
            }
        });
    }
}
