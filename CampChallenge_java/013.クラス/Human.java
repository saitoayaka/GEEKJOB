/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurasu;

/**
 *
 * @author guest1Day
 */
public class Human {
    
       public static void main(String[] args) {
        //インスタンス生成
        Ex ex = new Ex();
        //EX「の」 →　EX.
        ex.setHuman("鈴木", 24);
        ex.exHuman();
    }
}
class Ex {
   
    //２つフィールドを用意する
    
   String name;
    int age;
   
   //フィールドに値をセットするためのメソッド（変数名：メイン以外）
    
    void setHuman(String n, int a) {
        this.name = n;
        this.age = a;
    }

    //フィールドの中身を出力するためのメソッド
    void exHuman() {
        System.out.print(name);
        System.out.print(age);
    }
}
    

