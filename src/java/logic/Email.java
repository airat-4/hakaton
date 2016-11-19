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
public class Email {

    Random random = new Random();

    public String getEmail(String domen) {
        int length = random.nextInt(10) + 1;
        boolean withNumber = false;
        String email = "";
        for (int i = 0; i < length; i++) {
            email+= getRandomChar(withNumber);
            withNumber = true;
        }
        email += "@" + domen;
        return email;
    }

    private String getRandomChar(boolean withNumber) {
        boolean isNumber = random.nextBoolean();
        if (!withNumber) {
            isNumber = false;
        }
        if (isNumber) {
            return "" + random.nextInt(10);
        }
        if(random.nextInt(40) == 0)
            return "_";
        char c = (char) ((char) random.nextInt('z' - 'a' + 1) + 'a');
        return "" + c;
    }

}
