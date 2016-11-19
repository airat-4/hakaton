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
public class Name {
    private Random random = new Random();
    private String[] maleName = {
        "Кирилл",
        "Айрат",
        "Гарун",
        "Паша",
        "Александр"
    };
    private String[] famaleName = {
        "Катя",
        "Рамиля",
        "Оля",
        "Ксения",
        "Александра"
    };
    
    public String get(boolean isRus, boolean isMan){
        String name = maleName[random.nextInt(maleName.length)];
        if(!isMan){
            name = famaleName[random.nextInt(famaleName.length)];
        }
        if(!isRus){
            name = EnglishName.toEnglish(name);
        }
        return name;
    }
}
