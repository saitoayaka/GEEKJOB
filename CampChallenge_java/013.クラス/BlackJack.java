/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurasu;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author guest1Day
 */
public class BlackJack {

    public static void main(String[] args) {

        //Dealerの手札　手札
        Dealer tehuda = new Dealer();
        ArrayList<Integer> dealre = tehuda.deal();

        tehuda.setCard(dealre);
        
        
        
        while (tehuda.checkSum() == false) {

            ArrayList<Integer> hitre = tehuda.hit();
            tehuda.setCard(hitre);

            if (tehuda.checkSum() == true) {

                break;
            }
        }

        //Userの手札　手札２
        User tehuda2 = new User();
        //ArrayList<Integer> dealre2 = tehuda2.deal();
        tehuda2.setCard(tehuda.deal());

        

        while (tehuda2.checkSum() == false) {

            tehuda2.setCard(tehuda.hit());
            if (tehuda2.checkSum() == true) {
                break;
            }
        }

        if (tehuda2.checkSum() == true && tehuda.checkSum() == true) {
            if (tehuda2.open() == tehuda.open()) {
                System.out.print("Useが" + tehuda2.open() + "Delarが" + tehuda.open() + "で引き分け");

            }
            if (tehuda2.open() > tehuda.open()) {
                System.out.print("Userが" + tehuda2.open() + "で勝利");
                System.out.print("Delarが" + tehuda.open() + "で敗北");

            }
            if (tehuda2.open() < tehuda.open()) {
                System.out.print("Userが" + tehuda2.open() + "で敗北");
                System.out.print("Delarが" + tehuda.open() + "で勝利");
            }
        }

    }

}

abstract class Human {

    //手札
    ArrayList<Integer> mycard = new ArrayList<Integer>();

    public int open() {
        //手札の数値の合計
        int total = 0;
        for (int i = 0; i < mycard.size(); i++) {
            total = total + mycard.get(i);
        }
        return total;

    }

    public void setCard(ArrayList<Integer> yamahuda) {
        //引いたカードを手札に追加する

//        if (yamahuda.get(1) == null) {
//            mycard.add(yamahuda.get(0));
//        } else {
//            mycard.add(yamahuda.get(0));
//            mycard.add(yamahuda.get(1));     
//        }
        
        for(int i= 0; i<yamahuda.size(); i++){
              mycard.add(yamahuda.get(i));
        }

    
    }
    
    public boolean checkSum() {

        //手札の数値の合計が17以上ならtrue
        int total = open();

        if (total >= 17) {
            return true;
        } //手札の数値の合計が17より小さければfalse
        else {
            return false;
        }

    }
}

class User extends Human {
    
    
}

class Dealer extends Human {

    protected ArrayList<Integer> cards = new ArrayList();

    Dealer() {
        //山札に52枚追加

        for (int j = 1; j <= 4; j++) {

            for (int i = 1; i <= 13; i++) {

                if (i >= 11) {
                    cards.add(10);
                } else {
                    cards.add(i);
                }

            }
        }

        Collections.shuffle(cards);

    }

    public ArrayList<Integer> deal() {
        //山札から2枚引き、戻り値に

        ArrayList tuika = new ArrayList();
        tuika.add(cards.get(0));
        tuika.add(cards.get(1));

        cards.remove(0);
        cards.remove(1);

        return tuika;
    }

    public ArrayList<Integer> hit() {
        //山札から1枚引き、戻り値に

        ArrayList tuika2 = new ArrayList();
        tuika2.add(cards.get(0));

        cards.remove(0);

        return tuika2;
    }
}
