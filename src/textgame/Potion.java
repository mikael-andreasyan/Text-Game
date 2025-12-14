/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textgame;

/**
 *
 * @author mikae
 */
public class Potion {
    private int heal;
    
    public Potion(){
        heal = (int) (Math.random() * 9) + 1;
    }
    
    public int getHeal(){
        return heal;
    }
}
