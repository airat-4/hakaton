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
}
