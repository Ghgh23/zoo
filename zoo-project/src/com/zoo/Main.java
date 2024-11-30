package com.zoo;

import com.zoo.animals.*;
import com.zoo.enclosures.*;
import com.zoo.personnel.*;

public class Main {
    public static void main(String[] args) {
        // Создаем животных
        Lion simba = new Lion("Simba", 5);
        Tiger shereKhan = new Tiger("Shere Khan", 7);
        Elephant dumbo = new Elephant("Dumbo", 3);

        // Создаем клетки
        Cage lionCage = new Cage();
        Cage tigerCage = new Cage();
        Aviary elephantAviary = new Aviary();

        // Помещаем животных в клетки
        lionCage.addAnimal(simba);
        tigerCage.addAnimal(shereKhan);
        elephantAviary.addAnimal(dumbo);

        // Создаем персонал
        Zookeeper mufasa = new Zookeeper("Mufasa", 50000);
        Veterinarian scar = new Veterinarian("Scar", 60000);
        Trainer timon = new Trainer("Timon", 40000);

        // Нанимаем персонал
        mufasa.hire();
        scar.hire();
        timon.hire();

        // Кормим животных
        simba.feed();
        shereKhan.feed();
        dumbo.feed();

        // Тренируем животных
        simba.train("Jump");
        shereKhan.train("Roar");
        dumbo.train("Fly");

        // Увольняем сотрудника
        timon.fire();
    }
}