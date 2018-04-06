/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyoujyun;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author guest1Day
 */
public class jikokuhyouji2 {
    
    public static void main (String[] args) throws Exception{
       Calendar c = Calendar.getInstance();
       c.set(2016,10,4,10,0,0);
       Date d =c.getTime();
       System.out.print(d);
       
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       //Date day =sdf.parse("2016/11/4 10:00:00");
       //System.out.print(day);
     String s = sdf.format(d);
     System.out.print(s);
       
    }
    
    
    
}
