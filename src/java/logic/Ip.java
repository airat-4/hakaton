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
public class Ip {
    private Random random = new Random();
    public String getIpV4(){
        return "" + random.nextInt(226) + "."+ random.nextInt(226) + "."+ random.nextInt(226) + "."+ random.nextInt(226);
    }
    
    public String getIpV6(){
        String ip = "";
        boolean first = true; 
        for (int i = 0; i < 8; i++) {
            if(!first){
                ip += ":";
            }
            first = false;
            ip += getRandomHexChar();
            ip += getRandomHexChar();
            ip += getRandomHexChar();
            ip += getRandomHexChar();
        }
        return ip;
    }
    
    private String getRandomHexChar(){
        boolean isChar = random.nextBoolean();
        if(isChar){
            return "" + (char)('a' + random.nextInt(6));
        }else{
            return "" + random.nextInt(10);
        }
    }
}
