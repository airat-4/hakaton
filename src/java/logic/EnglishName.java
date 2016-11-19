/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.HashMap;

/**
 *
 * @author airat
 */
public class EnglishName {

    static String toEnglish(String rusName) {
        String upperCaseRusName = rusName.toUpperCase();
        String englishName = "";
        for (int i = 0; i < upperCaseRusName.length(); i++) {
            if(i == 0){
                englishName += getEnglishChar(upperCaseRusName.charAt(i));
            }else{
                englishName += getEnglishChar(upperCaseRusName.charAt(i)).toLowerCase();
            }
            
        }
        return englishName;
    }

    private static String getEnglishChar(char ch) {
        switch (ch) {
            case 'А':
                return "A";
            case 'Б':
                return "B";
            case 'В':
                return "V";
            case 'Г':
                return "G";
            case 'Д':
                return "D";
            case 'Е':
                return "E";
            case 'Ё':
                return "JO";
            case 'Ж':
                return "ZH";
            case 'З':
                return "Z";
            case 'И':
                return "I";
            case 'Й':
                return "Y";
            case 'К':
                return "K";
            case 'Л':
                return "L";
            case 'М':
                return "M";
            case 'Н':
                return "N";
            case 'О':
                return "O";
            case 'П':
                return "P";
            case 'Р':
                return "R";
            case 'С':
                return "S";
            case 'Т':
                return "T";
            case 'У':
                return "U";
            case 'Ф':
                return "F";
            case 'Х':
                return "KH";
            case 'Ц':
                return "C";
            case 'Ч':
                return "CH";
            case 'Ш':
                return "SH";
            case 'Щ':
                return "SHH";
            case 'Ъ':
                return "JHH";
            case 'Ы':
                return "IH";
            case 'Ь':
                return "JH";
            case 'Э':
                return "EH";
            case 'Ю':
                return "JU";
            case 'Я':
                return "JA";
            default:
                return String.valueOf(ch);
        }
    }
}
