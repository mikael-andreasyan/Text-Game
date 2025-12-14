/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textgame;

/**
 *
 * @author mikae
 */
public abstract class Item {
    int newDamage;
    double newPercent;
    
    public Item(int nDam, double nPerc){
        newDamage = nDam;
        newPercent = nPerc;
    }
    
    public int getDamage(){
        return newDamage;
    }
    
    public double getPercent(){
        return newPercent;
    }
    
}




class Sword extends Item {
  
    public Sword(){
        super((int)(Math.random()*10)+1, Math.random());
    }
}


class Bow extends Item{
    public Bow(){
        super((int)(Math.random()*10)+1, Math.random());
    }    
    
}