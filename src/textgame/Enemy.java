/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textgame;
import java.util.*;
/**
 *
 * @author mikae
 */
public class Enemy {
    private int health;
    private int damage;
    private String type;
    
    public Enemy(String biome){
        if(biome.equals("forest")){
            forest();
        } else if(biome.equals("cave")){
            cave();
        } else if(biome.equals("jungle")){
            jungle();
        } else if(biome.equals("desert")){
            desert();
        } else if(biome.equals("mountain")){
            mountain();
        }
    }
    
    private void forest(){
        int random = (int) (Math.random()*4); 
        
        if(random == 0){
            type = "orc";
            damage = 4;
            health = 3;
        } else if(random > 0){
            type = "wolf";
            damage = 2;
            health = 2;
        }
    }
    
    private void jungle(){
        int random = (int) (Math.random()*4); 
        
        if(random == 0){
            type = "dinosaur";
            damage = 3;
            health = 8;
        } else if(random > 0){
            type = "monkey";
            damage = 2;
            health = 2;
        }
    }
    
    private void cave(){
        int random = (int) (Math.random()*4); 
        
        if(random == 0){
            type = "gnome";
            damage = 6;
            health = 3;
        } else if(random > 0){
            type = "rat";
            damage = 1;
            health = 1;
        }
    }
    
    private void mountain(){
        int random = (int) (Math.random()*4); 
        
        if(random == 0){
            type = "Yeti";
            damage = 2;
            health = 7;
        } else if(random > 0){
            type = "bear";
            damage = 3;
            health = 2;
        }
    }
    
    private void desert(){
        int random = (int) (Math.random()*4); 
        
        if(random == 0){
            type = "Mummy";
            damage = 4;
            health = 4;
        } else if(random > 0){
            type = "scorpion";
            damage = 2;
            health = 1;
        }
    }
    
    public String getType(){
        return type;
    }
    
    public int getLives(){
        if(health > 0){
            return health;
        } else {
            return 0;
        }
    }
    
    public void damage(int dmg){
        health = health - dmg;
    }
    
    public int attack(){
        return damage;
    }
}
