package model;

import java.io.Serializable;
import java.util.UUID;

public class Employee implements Serializable {

    private UUID id;
    private Gender gender;
    private String name;
    private float salary, income;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public Employee(UUID id, Gender gender, String name, float salary) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", gender=" + gender + ", name=" + name + ", salary=" + salary + ", income=" + income + '}';
    }

    public String getProperties() {
        return "id=" + id + ", gender=" + gender + ", name=" + name + ", salary=" + salary + ", income=" + income;
    }
}
