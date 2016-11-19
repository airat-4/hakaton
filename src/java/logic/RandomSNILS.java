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
public class RandomSNILS {
    private Random random = new Random();
    public String getRandomSNILS(){
        String snils = "";
        int n = 9, sum = 0, y = 0;
        for (int i = 1; i < 10; i++) {
            int tmp = getRandomNumber();
            snils += tmp;
            sum += tmp*n;
            n--;
            if(i==3 || i == 6)
                snils += '-';
        }
        if(snils.compareTo("001-001-998") < 0){
            String yy = ""+getRandomNumber();
            yy += getRandomNumber();
            return snils+" "+yy;
        }else
            return snils+" 1111"+getY(sum);
    }
    
    private String getY (int sum) {
        if(sum<100)
            if(sum < 10)
                return "0"+sum;
            else
                return ""+sum;
        if(sum == 100 || sum == 101)
            return "00";
        if(sum > 101)
            return getY(sum%101);
        return "";
    }
    
    private int getRandomNumber(){
        return random.nextInt(10);
    }
    
    public static void main(String[] args) {
        RandomSNILS snils = new RandomSNILS();
        for (int i = 0; i < 100; i++) {
            System.out.println(snils.getRandomSNILS());
        }
        System.out.println(snils.getRandomSNILS());
    }
}
