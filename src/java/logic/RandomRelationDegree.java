/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;

/**
 *
 * @author Imadori
 */
public class RandomRelationDegree {
    private Random random = new Random();
    private String[] relation = {
        "Брат",
        "Сестра",
        "Родитель",
        "Дед",
        "Бабушка",
        "Жена",
        "Муж",
        "Зять",
        "Кузен",
        "Золовка",
        "Кузина",
        "Кум",
        "Кума",
        "Мачеха",
        "Отчим",
        "Падчерица",
        "Пасынок",
        "Племмяник",
        "Сват",
        "Внук",
        "Внучка",
        "Пращур",
        "Дядя",
        "Тётя",
        "Тесть",
        "Тёща",
        "Шурин",
        "Сноха"
    };
    
    public String getRelationDegree(){
        return relation[random.nextInt(relation.length)];
    }
}
