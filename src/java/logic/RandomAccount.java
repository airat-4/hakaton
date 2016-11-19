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
public class RandomAccount {
    private Random random = new Random();
    public String getRandomAccount () {
        String acc = "408";
               
        for (int i = 0; i < 17; i++) {
            acc += getRandomNumber();  
        }
        return acc;
    }
    
    private String getRandomNumber () {
        return "" + random.nextInt(10);
    }
}

