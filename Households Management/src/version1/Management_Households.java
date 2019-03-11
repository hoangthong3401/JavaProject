package version1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

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
        Set<String> keySet = lsHouseholds.keySet();
        String ID = generation();
        while (keySet.contains(ID)) {
            ID = generation();
        }
        Household h = new Household(ID, new ArrayList<>());
        h.input();
        lsHouseholds.put(ID, h);
        System.out.println("this");
    }

    @Override
    public void remove(String key) {
        if (lsHouseholds.containsKey(key)) {
            lsHouseholds.remove(key);
        } else {
            System.out.println("Key's not valid");
        }
    }

    @Override
    public void modify() {

    }

    @Override
    public String generation() {
        String result = "";
        for (int i = 0; i < 8; i++) {
            result += (char) (48 + new Random().nextInt(75));
        }
        return result;
    }

    @Override
    public void showInforamation() {
        if (!lsHouseholds.isEmpty() || lsHouseholds != null) {
            Set<Map.Entry<String, Household>> entrySet = lsHouseholds.entrySet();
            entrySet.stream().forEach((t) -> {
                System.out.println(t.getValue());
            });
        } else {

        }
    }

}
