package com.zoo.animals;

import com.zoo.utils.Feedable;
import com.zoo.utils.Trainable;

public abstract class AbstractAnimal implements Feedable, Trainable {

    private String name;
    private int age;

    public AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName());
    }

    @Override
    public void train(String trick) {
        System.out.println(getName() + " is learning to " + trick);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}