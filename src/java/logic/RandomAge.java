/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;

/**
 *
 * @author Александр
 */
public class RandomAge {
    private Random random = new Random();
    public int getRandomAdge(int begin, int end){
        return begin + random.nextInt(end - begin + 1);
    }
}
