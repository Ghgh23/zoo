package com.zoo.enclosures;

public class Cage extends AbstractEnclosure {
    @Override
    public void maintain() {
        System.out.println("Cleaning the cage...");
    }
}