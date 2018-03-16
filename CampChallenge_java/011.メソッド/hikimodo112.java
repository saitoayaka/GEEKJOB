/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "hikimodo112", urlPatterns = {"/hikimodo112"})
public class hikimodo112 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    ArrayList<ArrayList<String>>  prof (String str){
        
        
        ArrayList<String>name1 = new ArrayList<String>();
        name1.add("２３４");
        name1.add("鈴木");
        name1.add("1月生まれ");
        name1.add("東京都");
        ArrayList<String> name2 = new ArrayList<String>();
        name2.add("２３４");
        name2.add("高橋");
        name2.add("2月生まれ");
        name2.add("埼玉県");
        ArrayList<String> name3 = new ArrayList<String>();
        name3.add("３４５");
        name3.add("松本");
        name3.add("3月生まれ");
        name3.add("神奈川県");
        
       ArrayList<ArrayList<String>>name = new ArrayList<ArrayList<String>>();
       
        if(str.equals(name1.get(0))){
            name.add(name1);
        }if(str.equals(name2.get(0))){
            name.add(name2); 
        }if(str.equals(name3.get(0))){
            name.add(name3);
        }
        return name;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
                  ArrayList<ArrayList<String>> name = prof("２３４");
            
           for (int i=0; i<name.size(); i++){
              ArrayList<String> NAME = name.get(i);
           
            for (int j=3; j<NAME.size(); j++){
             
              out.print(NAME);//.get(1));
              //out.print(NAME.get(2));
              //out.print(NAME.get(3));
               
            }
               }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikimodo112</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikimodo112 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
