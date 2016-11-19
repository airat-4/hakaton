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
public class RandomStreetType {
    private Random random = new Random();
    private String[] type = {
        "Аллея",
        "Бульвар",
        "Набережная",
        "Переулок",
        "Проезд",
        "Просека",
        "Проспект",
        "Тупик",
        "Шоссе",
        "Авеню",
        "Тракт",
        "Разъезд",
        "Линия",
        "Магистраль"
    };
    
    public String getType(){
        return type[random.nextInt(type.length)];
    }
}
