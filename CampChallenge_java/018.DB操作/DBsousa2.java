/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hayong
 */

import java.sql.*;

public class DBsousa2 {
       
    public static void main(String[] args) {
        
    Connection db_con = null;
    PreparedStatement db_st = null;
   
    
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","hayong","hayong1225");
        
        System.out.print("接続完了");
    
        db_st = db_con.prepareStatement("INSERT INTO profiles VALUES(?,?,?,?,?); ");
        db_st.setInt(1,6);
        db_st.setString(2,"山田裕太");
        db_st.setString(3,"090-1234-5678");
        db_st.setInt(4,20);
        db_st.setDate(5, Date.valueOf("1998-12-25"));
        db_st.executeUpdate();
        
        
    
      db_st.close();
      db_con.close();
    }
    catch(SQLException e_sql){
         System.out.print("接続するときにエラーが発生しました。:"+e_sql.toString());
    }catch(Exception e){
         System.out.print("接続するときにエラーが発生しました。:"+e.toString());
    }finally{
        if (db_con != null){
         try{
             db_con.close();
         }catch(Exception e_con){
             System.out.print(e_con.getMessage());
         }     
    }

    }
    }
    }

