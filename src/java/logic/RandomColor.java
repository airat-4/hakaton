/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Александр
 */
public class RandomColor {
    private Random random = new Random();
    public String getRandomColor(){
        String color = "#";
        for (int i = 0; i < 6; i++) {
            color += getRandomChar();
        }
        return color;
    }
    
    private String getRandomChar(){
        boolean isChar = random.nextBoolean();
        if(isChar){
            return "" + (char)('a' + random.nextInt(6));
        }else{
            return "" + random.nextInt(10);
        }
    }
    
    public static void main(String[] args) {
        RandomColor color = new RandomColor();
        System.out.println(color.getRandomColor());
    }
}
