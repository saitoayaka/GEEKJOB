/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyoujyun;
import java.util.Calendar;
/**
 *
 * @author guest1Day
 */
public class timesutanpu2 {
    public static void main (String[] args){
    
    Calendar c = Calendar.getInstance();
    
    c.set(1988,4,21,1,23,45);
    
    int y = c.get(Calendar.YEAR);
    int M= c.get(Calendar.MONTH);
    int d= c.get(Calendar.DAY_OF_MONTH);
    int H= c.get(Calendar.HOUR_OF_DAY);
    int m= c.get(Calendar.MINUTE);
    int s= c.get(Calendar.SECOND);
    
    
    System.out.print(y+"年"+M+"月"+d+"日"+H+"時"+m+"分"+s+"秒");
    }
    
}
