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
                

    }

    private static void testColor() {
        TestServlet servlet = new TestServlet("GetColor");
        servlet.print();
    }
}
