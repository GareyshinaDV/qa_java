package com.example;

import java.util.List;


public class LionAlex extends Lion {

    public LionAlex(String sex, Feline feline) throws Exception {
        super(sex, feline);
        String name = "Алекс";
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }
}

