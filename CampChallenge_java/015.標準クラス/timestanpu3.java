/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyoujyun;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class timestanpu3 {
    public static void main (String[] args){
     Calendar c = Calendar.getInstance();
     c.set(2015,1,1,0,0,0);
     Date d = c.getTime();
     
     Calendar c2 = Calendar.getInstance();
     c2.set(2015,12,31,23,59,59);
     Date d2 = c2.getTime();
     
    // System.out.print("2015年1月1日0時0分0秒と2015年12月31日23時59分59秒の差は");
     System.out.print("2015年1月1日0時0分0秒と2015年12月31日23時59分59秒の差は"+(d2.getTime()-d.getTime())+"ミリ秒です");
        //Date  start = new Date();
     
     
    } 
    
}
