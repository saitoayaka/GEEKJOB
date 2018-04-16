/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author guest1Day
 */
@WebServlet(urlPatterns = {"/Session2"})
public class Session2 extends HttpServlet {

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
            //受け取る文字コード
            request.setCharacterEncoding("UTF-8");
            
            //情報の取り出し
            String name = request.getParameter("NAME");
            String gendar2 = request.getParameter("gendar1");
            String syumi = request.getParameter("syumi");
            
            //Int型の表示
           int gendar = Integer.parseInt(gendar2);
           String man = "男";
           String women = "女";
           
            //セッションの作成
            HttpSession hs = request.getSession();
            
            //セッションの利用
            hs.setAttribute("name1", name);
            if(gendar == 1){
                 hs.setAttribute("gendar",man );
            }else{
                 hs.setAttribute("gendar",women );

            }
            hs.setAttribute("syumi", syumi);
            
            
            //画面表示
            out.print("名前は"+(String)hs.getAttribute("name1")+"です");
            out.print("性別は"+(String)hs.getAttribute("gendar")+"です");
            out.print("趣味は"+(String)hs.getAttribute("syumi"));
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Session2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Session2 at " + request.getContextPath() + "</h1>");
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
