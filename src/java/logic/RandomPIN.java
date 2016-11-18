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
public class RandomPIN {
    private Random random = new Random();
    public String getRandomPIN(){
        String pin = "";
        for (int i = 0; i < 4; i++) {
            pin += getRandomNumber();
        }
        return pin;
    }
    
    private String getRandomNumber(){
        return "" + random.nextInt(10);
    }
}
