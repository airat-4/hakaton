/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;
import logic.EnglishName;

/**
 *
 * @author airat
 */
public class Patronymic {
    private Random random = new Random();
    private String[] maleName = {
        "Кирилл",
        "Айрат",
        "Гарун",
        "Паша",
        "Александр"
    };
    
    public String get(boolean isRus, boolean isMan){
        String name = maleName[random.nextInt(maleName.length)] + "ович";
        if(!isMan){
            name = maleName[random.nextInt(maleName.length)] + "oвна";
        }
        if(!isRus){
            name = EnglishName.toEnglish(name);
        }
      return name;
    }
}
