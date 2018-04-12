/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyoujyun;

import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author guest1Day
 */
public class matome {
   public static void main (String[] args){
      
       try{
         //ファイルオープン
          File f = new File ("log.txt");
          
          //SimpleDateFormat作成
          SimpleDateFormat sdf = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss");
          
         //ファイルの書き込み（準備）
          FileWriter fw = new FileWriter(f);
          
          //開始時間
          fw.write("開始");
          Calendar c = Calendar.getInstance();
          fw.write(sdf.format(c.getTime()));
         
          //ファイルクローズ
          fw.close();
          
          //ファイルの読み出し
          FileReader fr = new FileReader(f);
          
          //効率的に
          BufferedReader br = new BufferedReader(fr);
          System.out.print(br.readLine());
          
          //ファイルのクローズ
          br.close();
         
     }catch(IOException e){
         e.printStackTrace();
     }
       
       //Mathクラスの使用
       double a = 1.12;
       double b = 0.34;
       double c = 8.22;
       double d = 5.15;
       
       System.out.print(a +"の ");
       System.out.print("切り上げ値は"+ Math.ceil(a));
       System.out.print("切り捨て値は"+Math.floor(a));
       System.out.print("四捨五入すると"+Math.round(a));
       
       System.out.print(b+"の");
       System.out.print("切り上げ値は"+ Math.ceil(b));
       System.out.print("切り捨て値は"+Math.floor(b));
       System.out.print("四捨五入すると"+Math.round(b));
       
       System.out.print(c+"の");
       System.out.print("切り上げ値は"+ Math.ceil(c));
       System.out.print("切り捨て値は"+Math.floor(c));
       System.out.print("四捨五入すると"+Math.round(c));
       
       System.out.print(d+"の");
       System.out.print("切り上げ値は"+ Math.ceil(d));
       System.out.print("切り捨て値は"+Math.floor(d));
       System.out.print("四捨五入すると"+Math.round(d));
       
       
       try{
         //ファイルオープン
          File f2 = new File ("log.txt");   
           
        //SimpleDateFormat作成
        SimpleDateFormat sdf2  = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss");
        
        //ファイルの書き込み
        FileWriter fw2  = new FileWriter (f2);
        
        fw2.write("終了");
        Calendar e = Calendar.getInstance();
        fw2.write(sdf2.format(e.getTime()));
        
        //ファイルのクローズ
        fw2.close();
        
         //ファイルの読み出し
         FileReader fr = new FileReader(f2);
          
         //効率的に
         BufferedReader br = new BufferedReader(fr);
         System.out.print(br.readLine());
         
         //ファイルのクローズ
          br.close();
       
       }catch(IOException e){
        e.printStackTrace();
       }
       
       
       
   }
}
