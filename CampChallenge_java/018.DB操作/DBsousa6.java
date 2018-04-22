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

public class DBsousa6 {
    
    
    public static void main(String[] args) {
        
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null; 
    
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","hayong","hayong1225");
        
      
        db_st = db_con.prepareStatement("DELETE  FROM profiles WHERE profileID = ?;");
        db_st.setInt(1,6);
        db_st.executeUpdate();
        
       db_st = db_con.prepareStatement("SELECT * FROM profiles;");
       db_data= db_st.executeQuery();
    

        while(db_data.next()){
          System.out.print("profileID:"+db_data.getInt("profileID")+"<br>");
          System.out.print("名前:"+db_data.getString("name")+"<br>");
          System.out.print("電話番号:"+db_data.getString("tell")+"<br>");
          System.out.print("年齢:"+db_data.getInt("age")+"<br>");
          System.out.print("誕生日:"+db_data.getDate("birthday").toString()+"<br>");
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
