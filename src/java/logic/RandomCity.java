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
public class RandomCity {
    private Random random = new Random();
    private String[] relation = {
        "Самара",
        "Казань",
        "Отрадный",
        "Похвистнево",
        "Иннополис",
        "Москва",
        "Санкт-Петербург",
        "Рязань",
        "Пенза",
        "Сызрань",
        "Тольятти",
        "Нижний Новгород",
        "Екатеринбург",
        "Сыктывкар",
        "Йошкар-Ола",
        "Ижевск",
        "Волгоград",
        "Саратов",
        "Одесса",
        "Уфа",
        "Сургут",
        "Челябинск",
        "Владивосток",
        "Омск",
        "Тюмень",
        "Новосибирск",
        "Лондон",
        "Берлин"
    };
    
    public String getCity(){
        return relation[random.nextInt(relation.length)];
    }
}
