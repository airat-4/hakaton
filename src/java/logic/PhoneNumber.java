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
public class PhoneNumber {
    Random random = new Random();
    public String getPhoneNumber(String countryNuber, String operatorNumber){
        String phoneNumber = "";
        phoneNumber += countryNuber;
        phoneNumber += "(";
        phoneNumber += operatorNumber;
        phoneNumber += ")";
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        phoneNumber += "-";
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        phoneNumber += "-";
        phoneNumber += random.nextInt(10);
        phoneNumber += random.nextInt(10);
        return phoneNumber;
    }
    
    
}
