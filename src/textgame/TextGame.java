/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textgame;
import java.util.*;
/**
 *
 * @author mikael
 */
public class TextGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        World b = new World();
        Player p = new Player();
        b.begin();
        while(p.getLives()>0){
            System.out.println("Would you like to go North(N), South(S), West(W), East(E), or Fight(F) in your current location");
            String action = input.nextLine();
            action = action.toLowerCase();
            
            if(action.equals("north") || action.equals("n")){
                b.north();
            } else if(action.equals("west") || action.equals("w")){
                b.west();
            } else if(action.equals("east") || action.equals("e")){
                b.east();
            } else if(action.equals("south") || action.equals("s")){
                b.south();
            } else if(action.equals("fight") || action.equals("f")){
                p.fight(input, b);
            } else{
                System.out.println("You did not use a proper input, please try again.");
            }
            
        }
        
        System.out.println("GAME OVER! Rerun the application to restart");
    }
}
