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
public class okikae {

    public static void main(String[] args) {
        
        String mae = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        
        String ato = mae.replaceAll("I", "い");
        ato = ato.replaceAll("U", "う");
        
        System.out.print(ato);
    }
}
