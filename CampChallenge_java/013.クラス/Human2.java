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
public class Human2 {
    public static void main(String[] args) {
           Human3 ex = new Human3();
           ex.clear();
           
          
    }
}
class Ex2 {
    String name;
    int age;
   
    void setHuman(String n, int a) {
        this.name = n;
        this.age = a;
    }


    void exHuman() {
        System.out.print(name);
        System.out.print(age);
    }
}
    
class Human3 extends Ex2{
    void clear (){
      String name = null;
      int age =0;
      System.out.print(name);
      System.out.print(age);
      
      
    }
    
}
