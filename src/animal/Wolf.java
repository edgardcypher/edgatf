/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;


public class Wolf extends Canines {
    public String skinColor;
    public Wolf(String sColor){
        super();
        this.skinColor=sColor;
      
    }
    public void makeNoise(String st){
        //super.makeNoise();
        System.out.println(st);
    }
    public void eat(){
    System.out.println("i eat beef and bones");
    }
    public void dance(){}
}
