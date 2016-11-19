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
public class Zvanie {
    private Random random = new Random();
    private String[] zvanie = {
        "Рядовой",
        "Ефрейтор",
        "Младший сержант",
        "Сержант",
        "Старший сержант",
        "Старшина",
        "Прапорщик",
        "Старший прапорщик",
        "Младший лейтенант",
        "Лейтенант",
        "Старший лейтенант",
        "Капитан",
        "Майор",
        "Подполковник",
        "Полковник",
        "Генерал-майор",
        "Генерал-лейтенант",
        "Генерал-полковник ",
        "Генерал армии",
        "Маршал Российской Федерации"
    };
    
    public String getZvanie(){
        return zvanie[random.nextInt(zvanie.length)];
    }
}
