package model;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author jingtian
 */
public class Manager extends Employee implements Serializable {

    private int nEmployees;

    public Manager(UUID id, Gender gender, String name, float salary, int nEmployees) {
        super(id, gender, name, salary);
        this.nEmployees = nEmployees;
    }

    public int getNumberOfEmployee() {
        return nEmployees;
    }

    public void setNumberOfEmployee(int workday) {
        this.nEmployees = workday;
    }

    public void calIncome() {

    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", nEmployees=" + nEmployees + '}';
    }

}
