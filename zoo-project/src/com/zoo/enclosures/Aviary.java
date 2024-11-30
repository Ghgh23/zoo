package com.zoo.enclosures;

public class Aviary extends AbstractEnclosure {
    @Override
    public void maintain() {
        System.out.println("Trimming trees in the aviary...");
    }
}