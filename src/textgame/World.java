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
public class World {
    Location[][] world;
    private int row = 0;
    private int col = 0;
    private int rows = 0;
    private int cols = 0;
    
    
    public World(){
        rows = (int) (Math.random()*50)+1;
        cols = (int) (Math.random()*50)+1;
        world = new Location[rows][cols];
        for (int i = 0; i < world.length; i++){
            for(int j = 0; j < world[i].length; j++){
                world[i][j] = new Location();
            }
        }
        row = (world.length)/2;
        col = (world[row].length)/2;
    }
    
    
    public World(int r, int c){
        rows = r;
        cols = c;
        world = new Location[rows][cols];
        for (int i = 0; i < world.length; i++){
            for(int j = 0; j < world[i].length; j++){
                world[i][j] = new Location();
            }
        }
        row = (world.length)/2;
        col = (world[row].length)/2;
    }
    
    public void begin(){
        Location current = world[row][col];
        System.out.println(current.toString());
    }
    
    public String currentBiome(){
        return world[row][col].getBiome();
    }
    
    
    public void west(){
        if(col>0){
            col = col - 1;
            System.out.println(world[row][col].toString());
        } else {
            System.out.println("You are at the most West position on the map. You can't go any more West.");
        }
        
        
        
    }
    
    public void east(){
        if(col < world[row].length-1){
        col = col + 1;
        System.out.println(world[row][col].toString());
        } else {
            System.out.println("You are at the most East position on the map. You can't go any more East.");
        }
    }
    
    public void north(){
        if(row>0){
            row = row - 1;
            System.out.println(world[row][col].toString());
        } else {
            System.out.println("You are at the most North position on the map. You can't go any more North.");
        }
        
    }
    
    public void south(){
        if(row < world.length-1){
           row = row + 1;
           System.out.println(world[row][col].toString());
        } else {
            System.out.println("You are at the most South position on the map. You can't go any more South.");
        }
          
    }
}
