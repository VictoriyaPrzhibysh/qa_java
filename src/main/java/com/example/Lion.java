package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    // Создали в классе Lion приватное поле типа FelineAnimal теперь объект FelineAnimal — это поле класса Lion
    private FelineAnimal felineAnimal;
    // Объект передаётся в конструктор. Он создан извне класса
    public Lion(String sex, FelineAnimal felineAnimal) throws Exception {

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.felineAnimal = felineAnimal;
    }

    public int getKittens() {
        return felineAnimal.getKittens(1);
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineAnimal.getFood("Хищник");
    }
}
