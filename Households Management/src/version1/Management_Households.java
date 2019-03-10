package version1;

import java.util.HashMap;

public class Management_Households implements iManagement_Household {

    private HashMap<String, Household> lsHouseholds;

    public Management_Households() {
    }

    public Management_Households(HashMap<String, Household> lsHouseholds) {
        this.lsHouseholds = lsHouseholds;
    }

    public HashMap<String, Household> getLsHouseholds() {
        return lsHouseholds;
    }

    public void setLsHouseholds(HashMap<String, Household> lsHouseholds) {
        this.lsHouseholds = lsHouseholds;
    }

    @Override
    public void add() {
            
    }

    @Override
    public void remove() {
    }

    @Override
    public void modify() {
    }

}
