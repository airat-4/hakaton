/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testServlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import logic.Patronymic;

/**
 *
 * @author Александр
 */
public class Test {
    
    
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        testColor();   
        testAge();   
        testZvanie();   
        testIp("v4");   
        testIp("v6");   
        testTime();   

        testPIN();
        testSNILS();
        testLanguage();
        testLastName();
        testName();
        testPatronymic();
        testFIO();
        
    }

    private static void testColor() {
        print("GetColor");
    }

    private static void print(String servletName) {
        TestServlet servlet = new TestServlet(servletName);
        servlet.print();
    }

    private static void testAge() {
        String servletName = "GetAge";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("begin", "5");
        servlet.addParametr("end", "10");
        servlet.print();
    }

    private static void testZvanie() {
        print("GetZvanie");
    }

    private static void testIp(String protocol) {
        String servletName = "GetIp";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("protocolVersion", protocol);
        servlet.print();
    }

    private static void testTime() {
        print("GetTime");
    }
    
    private static void testPIN() {
        print("GetPIN");
    }

    private static void testSNILS() {
        print("GetSNILS");
    }

    private static void testLanguage() {
        print("GetLanguage");
    }

    private static void testLastName() {
        String servletName = "GetLastName";
        testFIO(servletName);
    }

    private static void testName() {
        String servletName = "GetName";
        testFIO(servletName);
    }

    private static void testPatronymic() {
        String servletName = "GetPatronymic";
        testFIO(servletName);
    }

    private static void testFIO() {
        String servletName = "GetFIO";
        testFIO(servletName);
    }

    private static void testFIO(String servletName) {
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("language", "ru");
        servlet.addParametr("sex", "male");
        servlet.print();
        
        servlet = new TestServlet(servletName);
        servlet.addParametr("language", "en");
        servlet.addParametr("sex", "famale");
        servlet.print();
    }
}
