/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyoujyun;

import java.io.*;


/**
 *
 * @author guest1Day
 */
public class filekakidasi {
   public static void main (String[] args){
    try{
      File f = new File ("text.txt");
    
       FileWriter fw = new FileWriter (f);
            fw.write("齋藤彩花です"+"<br>"+"19歳です"+"<br>"+"よろしくお願い致します");
            fw.close();
      
       FileReader fr = new FileReader(f);
            
       BufferedReader br = new BufferedReader (fr);
       System.out.print(br.readLine());
       br.close();
            
     }catch(IOException e){
       e.printStackTrace();
     }
   }
   
}
