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
        
public class DBsousa1 {
    static Connection db_con = null;
    static PreparedStatement db_st = null;
    static ResultSet db_data = null;
    
    public static void main(String[] args) {
    
    try{
        Class.forName("com,sql.jdbc.Priver").newInstance();
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","hayong","hayong1225");

        db_st = db_con.prepareStatement("select*from profiles where age = ?");
        db_st.setInt(1,30);
        db_data = db_st.executeQuery();
        while (db_data.next()) {
            System.out.print("名前" + db_data.getString("name") + "<br>");
        }

      db_data.close();
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
