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
public class Location {
    private String biome;
    
    
    public Location(){
        int random = (int) (Math.random()*5);
        if(random == 0){
            biome = "forest";
        } else if(random == 1){
            biome = "jungle";
        } else if(random == 2){
            biome = "mountain";
        } else if(random == 3){
            biome = "cave";
        } else{
            biome = "desert";
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "You are currently in a " + biome;
    }
    
    public String getBiome(){
        return biome;
    }
}
