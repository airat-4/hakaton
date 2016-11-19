/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author airat
 */
public class GetCountry extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String domen = request.getParameter("abbreviature");

            switch (domen.toUpperCase()) {
                case "AUS":
                    out.print("Australia");
                    break;
                case "AUT":
                    out.print("Austria");
                    break;
                case "AZE":
                    out.print("Azerbaijan");
                    break;
                case "ALA":
                    out.print("Aland Islands");
                    break;
                case "ALB":
                    out.print("Albania");
                    break;
                case "DZA":
                    out.print("Algeria");
                    break;
                case "AIA":
                    out.print("Anguilla");
                    break;
                case "AGO":
                    out.print("Angola");
                    break;
                case "AND":
                    out.print("Andorra");
                    break;
                case "ATA":
                    out.print("Antarctica");
                    break;
                case "ARG":
                    out.print("Argentina");
                    break;
                case "ARM":
                    out.print("Armenia");
                    break;
                case "ABW":
                    out.print("Aruba");
                    break;
                case "AFG":
                    out.print("Afghanistan");
                    break;
                case "BHS":
                    out.print("Bahamas");
                    break;
                case "BGD":
                    out.print("Bangladesh");
                    break;
                case "BRB":
                    out.print("Barbados");
                    break;
                case "BHR":
                    out.print("Bahrain");
                    break;
                case "BLR":
                    out.print("Belarus");
                    break;
                case "BLZ":
                    out.print("Belize");
                    break;
                case "BEL":
                    out.print("Belgium");
                    break;
                case "BEN":
                    out.print("Benin");
                    break;
                case "BMU":
                    out.print("Bermuda");
                    break;
                case "BGR":
                    out.print("Bulgaria");
                    break;
                case "BOL":
                    out.print("Bolivia");
                    break;
                case "BWA":
                    out.print("Botswana");
                    break;
                case "BRA":
                    out.print("Brazil");
                    break;
                case "BDI":
                    out.print("Burundi");
                    break;
                case "BTN":
                    out.print("Bhutan");
                    break;
                case "VUT":
                    out.print("Vanuatu");
                    break;
                case "HUN":
                    out.print("Hungary");
                    break;
                case "VEN":
                    out.print("Venezuela");
                    break;
                case "GAB":
                    out.print("Gabon");
                    break;
                case "HTI":
                    out.print("Haiti");
                    break;
                case "GUY":
                    out.print("Guyana");
                    break;
                case "GMB":
                    out.print("Gambia");
                    break;
                case "GHA":
                    out.print("Ghana");
                    break;
                case "GLP":
                    out.print("Guadeloupe");
                    break;
                case "GTM":
                    out.print("Guatemala");
                    break;
                case "GIN":
                    out.print("Guinea");
                    break;
                case "DEU":
                    out.print("Germany");
                    break;
                case "GIB":
                    out.print("Gibraltar");
                    break;
                case "HND":
                    out.print("Honduras");
                    break;
                case "GRD":
                    out.print("Grenada");
                    break;
                case "GRL":
                    out.print("Greenland");
                    break;
                case "GRC":
                    out.print("Greece");
                    break;
                case "GEO":
                    out.print("Georgia");
                    break;
                case "GUM":
                    out.print("Guam");
                    break;
                case "DNK":
                    out.print("Denmark");
                    break;
                case "DJI":
                    out.print("Djibouti");
                    break;
                case "DMA":
                    out.print("Dominica");
                    break;
                case "EGY":
                    out.print("Egypt");
                    break;
                case "ZMB":
                    out.print("Zambia");
                    break;
                case "ZWE":
                    out.print("Zimbabwe");
                    break;
                case "ISR":
                    out.print("Israel");
                    break;
                case "IND":
                    out.print("India");
                    break;
                case "IDN":
                    out.print("Indonesia");
                    break;
                case "JOR":
                    out.print("Jordan");
                    break;
                case "IRQ":
                    out.print("Iraq");
                    break;
                case "IRL":
                    out.print("Ireland");
                    break;
                case "ISL":
                    out.print("Iceland");
                    break;
                case "ESP":
                    out.print("Spain");
                    break;
                case "ITA":
                    out.print("Italy");
                    break;
                case "YEM":
                    out.print("Yemen");
                    break;
                case "KAZ":
                    out.print("Kazakhstan");
                    break;
                case "KHM":
                    out.print("Cambodia");
                    break;
                case "CMR":
                    out.print("Cameroon");
                    break;
                case "CAN":
                    out.print("Canada");
                    break;
                case "QAT":
                    out.print("Qatar");
                    break;
                case "KEN":
                    out.print("Kenya");
                    break;
                case "CYP":
                    out.print("Cyprus");
                    break;
                case "KGZ":
                    out.print("Kyrgyzstan");
                    break;
                case "KIR":
                    out.print("Kiribati");
                    break;
                case "CHN":
                    out.print("China");
                    break;
                case "COL":
                    out.print("Colombia");
                    break;
                case "KOM":
                    out.print("Comoros");
                    break;
                case "CUB":
                    out.print("Cuba");
                    break;
                case "KWT":
                    out.print("Kuwait");
                    break;
                case "LVA":
                    out.print("Latvia");
                    break;
                case "LSO":
                    out.print("Lesotho");
                    break;
                case "LBR":
                    out.print("Liberia");
                    break;
                case "LBN":
                    out.print("Lebanon");
                    break;
                case "LTU":
                    out.print("Lithuania");
                    break;
                case "LIE":
                    out.print("Liechtenstein");
                    break;
                case "LUX":
                    out.print("Luxembourg");
                    break;
                case "MUS":
                    out.print("Mauritius");
                    break;
                case "MRT":
                    out.print("Mauritania");
                    break;
                case "MDG":
                    out.print("Madagascar");
                    break;
                case "MYT":
                    out.print("Mayotte");
                    break;
                case "MAC":
                    out.print("Macau");
                    break;
                case "MWI":
                    out.print("Malawi");
                    break;
                case "MYS":
                    out.print("Malaysia");
                    break;
                case "MLI":
                    out.print("Mali");
                    break;
                case "MDV":
                    out.print("Maldives");
                    break;
                case "MLT":
                    out.print("Malta");
                    break;
                case "MAR":
                    out.print("Morocco");
                    break;
                case "MTQ":
                    out.print("Martinique");
                    break;
                case "MEX":
                    out.print("Mexico");
                    break;
                case "MOZ":
                    out.print("Mozambique");
                    break;
                case "MCO":
                    out.print("Monaco");
                    break;
                case "MNG":
                    out.print("Mongolia");
                    break;
                case "MSR":
                    out.print("Montserrat");
                    break;
                case "MMR":
                    out.print("Myanmar");
                    break;
                case "NAM":
                    out.print("Namibia");
                    break;
                case "NPL":
                    out.print("Nepal");
                    break;
                case "NER":
                    out.print("Niger");
                    break;
                case "NGA":
                    out.print("Nigeria");
                    break;
                case "NLD":
                    out.print("Netherlands");
                    break;
                case "NIC":
                    out.print("Nicaragua");
                    break;
                case "NIU":
                    out.print("Niue");
                    break;
                case "NOR":
                    out.print("Norway");
                    break;
                case "OMN":
                    out.print("Oman");
                    break;
                case "PAK":
                    out.print("Pakistan");
                    break;
                case "PLW":
                    out.print("Palau");
                    break;
                case "PSE":
                    out.print("Palestine");
                    break;
                case "PAN":
                    out.print("Panama");
                    break;
                case "PRY":
                    out.print("Paraguay");
                    break;
                case "PER":
                    out.print("Peru");
                    break;
                case "POL":
                    out.print("Poland");
                    break;
                case "PRT":
                    out.print("Portugal");
                    break;
                case "RUS":
                    out.print("Russia");
                    break;
                case "RWA":
                    out.print("Rwanda");
                    break;
                case "ROM":
                    out.print("Romania");
                    break;
                case "SWZ":
                    out.print("Swaziland");
                    break;
                case "SYC":
                    out.print("Seychelles");
                    break;
                case "SEN":
                    out.print("Senegal");
                    break;
                case "SRB":
                    out.print("Serbia");
                    break;
                case "SGP":
                    out.print("Singapore");
                    break;
                case "SVN":
                    out.print("Slovenia");
                    break;
                case "SOM":
                    out.print("Somalia");
                    break;
                case "SDN":
                    out.print("Sudan");
                    break;
                case "SUR":
                    out.print("Suriname");
                    break;
                case "TJK":
                    out.print("Tajikistan");
                    break;
                case "THA":
                    out.print("Thailand");
                    break;
                case "TWN":
                    out.print("Taiwan");
                    break;
                case "TGO":
                    out.print("Togo");
                    break;
                case "TKL":
                    out.print("Tokelau");
                    break;
                case "TON":
                    out.print("Tonga");
                    break;
                case "TUV":
                    out.print("Tuvalu");
                    break;
                case "TUN":
                    out.print("Tunisia");
                    break;
                case "TKM":
                    out.print("Turkmenistan");
                    break;
                case "TUR":
                    out.print("Turkey");
                    break;
                case "UGA":
                    out.print("Uganda");
                    break;
                case "UZB":
                    out.print("Uzbekistan");
                    break;
                case "UKR":
                    out.print("Ukraine");
                    break;
                case "URY":
                    out.print("Uruguay");
                    break;
                case "FJI":
                    out.print("Fiji");
                    break;
                case "PHL":
                    out.print("Philippines");
                    break;
                case "FIN":
                    out.print("Finland");
                    break;
                case "FRA":
                    out.print("France");
                    break;
                case "HRV":
                    out.print("Croatia");
                    break;
                case "TCD":
                    out.print("Chad");
                    break;
                case "MNE":
                    out.print("Montenegro");
                    break;
                case "CHL":
                    out.print("Chile");
                    break;
                case "CHE":
                    out.print("Switzerland");
                    break;
                case "SWE":
                    out.print("Sweden");
                    break;
                case "ECU":
                    out.print("Ecuador");
                    break;
                case "ERI":
                    out.print("Eritrea");
                    break;
                case "EST":
                    out.print("Estonia");
                    break;
                case "ETH":
                    out.print("Ethiopia");
                    break;
                case "JAM":
                    out.print("Jamaica");
                    break;
                case "JPN":
                    out.print("Japan");
                    break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
