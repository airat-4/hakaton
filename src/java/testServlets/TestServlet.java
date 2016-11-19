/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testServlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
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

    private static PrintStream out;
    private String domen = "http://127.0.0.1";
    private String port = "8084";
    private String name = "Hakaton";
    private String servletName = "Hakaton";
    private static String fileName = "test";
    private Map<String, String> parametr = new HashMap();

    static {
        try {
            out = new PrintStream(new File(fileName + (System.currentTimeMillis() % 100) + ".txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public TestServlet(String servletName) {
        this.servletName = servletName;
    }

    public void addParametr(String name, String value) {
        parametr.put(name, value);
    }

    private String getParametr() {
        String param = "";
        boolean first = true;
        for (String key : parametr.keySet()) {
            if (first) {
                param += "?";
            } else {
                param += "&";
            }
            first = false;
            param += key + "=" + parametr.get(key);
        }
        return param;
    }

    public void print() {
        try {
            URL obj = new URL(domen + ":" + port + "/" + name + "/" + servletName + getParametr());
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String log = servletName + getParametr() + " - "+ in.readLine();
            System.out.println(log);
            out.println(log);
            out.flush();
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
