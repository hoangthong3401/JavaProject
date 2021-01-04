package model;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author jingtian
 */
public class Worker extends Employee implements Serializable {

    private int workday;

    public Worker(UUID id, Gender gender, String name, float salary, int workday) {
        super(id, gender, name, salary);
        this.workday = workday;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public void calIncome() {

    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() + ", workday=" + workday + '}';
    }

}
