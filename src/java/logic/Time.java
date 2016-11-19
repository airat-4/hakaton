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
public class Time {
    private Random random = new Random();
    public String getRandomTime(){
        int h = random.nextInt(24);
        int m = random.nextInt(60);
        return validate(h) + ":" + validate(m);
    }
    
    private String validate(int i){
        if(i<10){
            return "0" + i;
        }else{
            return ""+i;
        }
    }
}
