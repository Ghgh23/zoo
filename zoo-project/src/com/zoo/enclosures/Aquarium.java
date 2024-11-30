package com.zoo.enclosures;

public class Aquarium extends AbstractEnclosure {
    @Override
    public void maintain() {
        System.out.println("Changing water in the aquarium...");
    }
}