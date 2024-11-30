package com.zoo.personnel;

import com.zoo.utils.Employable;

public abstract class AbstractEmployee implements Employable {

    private String name;
    private double salary;

    public AbstractEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void hire() {
        System.out.println(getName() + " has been hired.");
    }

    @Override
    public void fire() {
        System.out.println(getName() + " has been fired.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}