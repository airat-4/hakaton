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
public class Language {
    private Random random = new Random();
    private String[] languages = {
        "Русский",
        "Китайский",
        "Татарский",
        "Японский",
        "Французкий",
        "Чувашский",
        "Мордовский",
        "Английский",
    };
    
    public String get(){
        return languages[random.nextInt(languages.length)];
    }
}
