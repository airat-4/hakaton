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
        testAcc();
    }

    private static void testColor() {
        print("GetColor");
    }

    private static void print(String servletName) {
        TestServlet servlet = new TestServlet(servletName);
        System.out.print(servletName+ " - ");
        servlet.print();
    }

    private static void testAge() {
        String servletName = "GetAge";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("begin", "5");
        servlet.addParametr("end", "10");
        
        System.out.print(servletName+ " - ");
        servlet.print();
    }

    private static void testZvanie() {
        print("GetZvanie");
    }

    private static void testIp(String protocol) {
        String servletName = "GetIp";
        TestServlet servlet = new TestServlet(servletName);
        servlet.addParametr("protocolVersion", protocol);
        System.out.print(servletName+  " Ip"+ protocol+" - ");
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

    private static void testAcc() {
        print("GetAccount");
    }
}
