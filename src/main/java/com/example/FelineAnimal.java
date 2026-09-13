package com.example;

// Создали интерфейс, который будет реализовывать класс Feline

import java.util.List;

public interface FelineAnimal {

        List<String> eatMeat() throws Exception;
        List<String> getFood(String type) throws Exception;
        String getFamily();
        int getKittens(int kittensCount);
    }



