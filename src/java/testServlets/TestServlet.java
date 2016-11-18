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
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Александр
 */
public class TestServlet {

    private String domen = "http://127.0.0.1";
    private String port = "8084";
    private String name = "Hakaton";
    private String servletName = "Hakaton";
    private Map<String, String> parametr = new HashMap();

    public TestServlet(String servletName) {
        this.servletName = servletName;
    }
    
    public void addParametr(String name, String value){
        parametr.put(name, value);
    }

    public void print() {
        try {
            URL obj = new URL(domen + ":" + port + "/" + name + "/" + servletName);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            for (String key : parametr.keySet()) {
                con.setRequestProperty(key,parametr.get(key));
            }
            System.out.println(in.readLine());
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
