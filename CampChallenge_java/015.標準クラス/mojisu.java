/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyoujyun;

/**
 *
 * @author guest1Day
 */
public class mojisu {
    
   public static void main (String[] args){
    
       String  mail = syori("geekjobdegakusyu@gmail.com");
         
            System.out.print(mail);
       
     
   }
   
   public static String syori (String nagasa){
      
       String mail = (nagasa.substring(16));
         
            return mail;
       
     
   }
}
