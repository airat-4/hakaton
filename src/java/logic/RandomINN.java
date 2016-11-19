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
public class RandomINN {

    private Random random = new Random();

    public String getRandomINN(String type) {

        String inn = "";
        String[] arrRegion = new String[85];
        
        int sum = 0;
        for (int i = 0; i < 79; i++) {
            if (i < 9) {
                arrRegion[i] = "0" + (i + 1);
            } else {
                arrRegion[i] = "" + (i + 1);
            }
        }
        arrRegion[79] = "" + 83;
        arrRegion[80] = "" + 86;
        arrRegion[81] = "" + 87;
        arrRegion[82] = "" + 89;
        arrRegion[83] = "" + 91;
        arrRegion[84] = "" + 92;

        inn += arrRegion[random.nextInt(85)];
        inn += getRandomNumber();
        inn += getRandomNumber();
        inn += getRandomNumber();
        inn += getRandomNumber();
        inn += getRandomNumber();
        inn += getRandomNumber();
        inn += getRandomNumber();
        if (type.equals("юр")) {
            int[] k = {2, 4, 10, 3, 5, 9, 4, 6, 8, 0};
            for (int i = 0; i < inn.length(); i++) {
                sum += Integer.parseInt("" + inn.charAt(i)) * k[i];
            }
            if(sum>9)
                inn += sum % 11;
            else
                inn += sum;
        } else {
            inn+= getRandomNumber();
            int[] k = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8, 0};
            for (int i = 0; i < inn.length(); i++) {
                sum += Integer.parseInt("" + inn.charAt(i)) * k[i];
            }
            if(sum>9){
                
                if(sum % 11==10)
                    inn += 0;
                else
                    inn += sum % 11;
            }
            else{
                inn += sum;
            }
            int[] k2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8, 0};
            sum = 0;
            for (int i = 0; i < inn.length(); i++) {
                sum += Integer.parseInt("" + inn.charAt(i)) * k2[i];
            }
            if(sum>9){
                if(sum % 11==10)
                    inn += 0;
                else
                    inn += sum % 11;
            }
            else
                inn += sum;
        }
        return inn;
    }

    private String getRandomNumber() {
        return "" + random.nextInt(10);
    }

    public static void main(String[] args) {
        RandomINN inn = new RandomINN();
        System.out.println(inn.getRandomINN("физ"));
    }
}
