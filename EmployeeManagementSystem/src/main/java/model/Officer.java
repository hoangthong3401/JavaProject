package model;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author jingtian
 */
public class Officer extends Employee implements Serializable {

    private float coefficient;

    public Officer(UUID id, Gender gender, String name, float salary, float coefficient) {
        super(id, gender, name, salary);
        this.coefficient = coefficient;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public void calIncome() {

    }

    @Override
    public String toString() {
        return "Officer{" + super.toString() + ", coefficient=" + coefficient + '}';
    }

}
