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
public class RandomBankName {
    private Random random = new Random();
    private String[] bankName = {
        "Сбербанк",
        "ВТБ 24",
        "Газпромбанк",
        "ФК Открытие",
        "Альфа-Банк",
        "Россельхозбанк",
        "Промсвязьбанк",
        "Бинбанк",
        "Райффайзенбанк",
        "Совкомбанк",
        "Абсолют Банк",
        "Югра",
        "Хоум Кредит Банк",
        "Тинькофф Банк",
        "Кошелев-Банк",
        "ЮниКредит Банк",
        "Сетелем Банк",
        "Росгосстрах Банк",
        "МДМ Банк",
        "Газбанк"
    };
    
    public String getBankName(){
        return bankName[random.nextInt(bankName.length)];
    } 
}
