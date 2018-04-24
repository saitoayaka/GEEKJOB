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
import java.sql.*;

/**
 *
 * @author hayong
 */
@WebServlet(urlPatterns = {"/DBsousa10"})
public class DBsousa10 extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
           
            request.setCharacterEncoding("UTF-8");     
            printResults(out,request.getParameter("profileID")); 
       
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DBsousa10</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DBsousa10 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
       public void printResults(PrintWriter out,String profileID){
   
    
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null; 
    
    
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","hayong","hayong1225");
        

      
       db_st = db_con.prepareStatement("DELETE FROM profiles WHERE profileID = ?");
       db_st.setInt(1,Integer.parseInt(profileID));
       db_st.executeUpdate();
       
       
       db_st = db_con.prepareStatement("SELECT * FROM profiles;");
       db_data= db_st.executeQuery();
      

        while(db_data.next()){
          out.print("profileID:"+db_data.getInt("profileID")+"<br>");
          out.print("名前:"+db_data.getString("name")+"<br>");
          out.print("電話番号:"+db_data.getString("tell")+"<br>");
          out.print("年齢:"+db_data.getInt("age")+"<br>");
          out.print("誕生日:"+db_data.getDate("birthday").toString()+"<br>");
        }
        
        
      db_data.close();
      db_st.close();
      db_con.close();
    }
    catch(SQLException e_sql){
         out.print("接続するときにエラーが発生しました。:"+e_sql.toString());
    }catch(Exception e){
         out.print("接続するときにエラーが発生しました。:"+e.toString());
    }finally{
        if (db_con != null){
         try{
             db_con.close();
         }catch(Exception e_con){
             out.print(e_con.getMessage());
         }     
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
