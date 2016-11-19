/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;

/**
 *
 * @author airat
 */
public class LastName {
    private Random random = new Random();
    private String[] lastName = {
        "Стороженков",
        "Гареев",
        "Носов",
        "Алиев",
        "Чеканушкин",
        "Итрухин",
        "Ефремов",
        "Иванов",
    };
    
    public String get(boolean isRus, boolean isMan){
        String name = lastName[random.nextInt(lastName.length)];
        if(!isMan){
            name += "a";
        }
        if(!isRus){
            name = EnglishName.toEnglish(name);
        }
        return name;
    }
}
