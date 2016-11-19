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
public class RandomMaritalStatus {
    private Random random = new Random();
    private String[] status = {
        "Замужем",
        "Не замужем",
        "Женат",
        "Холост"
    };
    
    public String getStatus(){
        return status[random.nextInt(status.length)];
    } 
}
