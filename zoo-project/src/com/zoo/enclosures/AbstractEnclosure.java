package com.zoo.enclosures;

import java.util.ArrayList;
import java.util.List;

import com.zoo.animals.AbstractAnimal;

public abstract class AbstractEnclosure {

    protected List<AbstractAnimal> animals;

    public AbstractEnclosure() {
        animals = new ArrayList<>();
    }

    public void addAnimal(AbstractAnimal animal) {
        animals.add(animal);
    }

    public List<AbstractAnimal> getAnimals() {
        return animals;
    }

    public abstract void maintain();
}