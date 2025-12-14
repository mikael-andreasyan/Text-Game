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
public class Player {
    private int lives;
    private double punchAcc;
    private double shootAcc;
    private int shootDam;
    private int punchDam;
    
    public Player(){
        lives = 20;
        punchDam = 1;
        shootDam = 2;
        punchAcc = 0.7;
        shootAcc = 0.5;
    }
    
    public Player(int life){
        lives = life;
    }
    
    public int getLives(){
        return lives;
    }
    
    
    public void punch(Enemy en){
        double hit = (Math.random());
        
        if(hit<=punchAcc){
          en.damage(punchDam);
          System.out.println("You punched the " + en.getType() + "! It now has " + en.getLives() + " lives.");
        } else {
          System.out.println("You missed your attack!");
        }
    }
    
    public void shoot(Enemy en){
        double hit = Math.random();
        
        if(hit<=shootAcc){
            en.damage(shootDam);
            System.out.println("You shot the " + en.getType() + "! It now has " + en.getLives() + " lives.");
        } else {
            System.out.println("You missed your attack!");
        }
    }
    
    public void fight(Scanner input, World b){
        System.out.println("You search for an enemy to fight...");
        String biome = b.currentBiome();
        Enemy en = new Enemy(biome);
        boolean flee = false;
        
        System.out.println("You have found a " + en.getType());
        while(lives > 0 && en.getLives() > 0){
            System.out.println("Would you like to Punch(p), Shoot(s), or Flee(F)?");
            String attack = input.nextLine();
            attack = attack.toLowerCase();
            
            
            if(attack.equals("punch") || attack.equals("p")){
                punch(en);
                lives -=en.attack();
                System.out.println("The " +en.getType() + " hit you for " + en.attack() + " damage. You now have " + lives + " lives.");
            } else if(attack.equals("shoot") || attack.equals("s")){
                shoot(en);
                lives -=en.attack();
                System.out.println("The " +en.getType() + " hit you for " + en.attack() + " damage. You now have " + lives + " lives.");
            } else if(attack.equals("flee") || attack.equals("f")){
                System.out.println("You ran away.");
                flee = true;
                break;
            } else {
                System.out.println("Please put in a proper input.");
            }
        }
        
        if(lives > 0 && !flee){
            System.out.println("You defeated the " + en.getType() + "!");
            getItem(input);
        }
    }
    
    public void potion(Scanner input, Potion p){
        System.out.println("You found a health potion that heals " + String.valueOf(p.getHeal()) + " health. Do you want to Drink(d) it or No(n)?");
        String response = input.nextLine();
        response = response.toLowerCase();
        if(response.equals("drink") || response.equals("d")){
                lives += p.getHeal();
                System.out.println("You drink the potion. Now you have " + String.valueOf(lives) + " lives");
        } else if(response.equals("no") || response.equals("n")){
                System.out.println("You didn't drink the potion because you are stupid.");
        } else {
            System.out.println("You did not use a proper input, please try again.");
            potion(input, p);
        }
    }
    
    public void sword(Scanner input, Sword s){
        System.out.println("You currently have " + String.valueOf((int) (punchAcc*100)) + "% accuracy and " + String.valueOf(punchDam) + " damage on your punch.");
        System.out.println("You found a sword with " + String.valueOf((int)(s.getPercent()*100)) + "% accuracy and " + String.valueOf(s.getDamage()) + " punch damage. Do you want to Take(t) it or No(n)?");
        String response = input.nextLine();
        response = response.toLowerCase();
           
        if(response.equals("take") || response.equals("t")){
                punchAcc = s.getPercent();
                punchDam = s.getDamage();
                System.out.println("You picked up the sword.");
                System.out.println("You now have " + String.valueOf((int)(punchAcc*100)) + "% accuracy and " + String.valueOf(punchDam) + " damage on your punch.");
        } else if(response.equals("no") || response.equals("n")){
                System.out.println("You didn't take the sword.");
        } else{
            System.out.println("You did not use a proper input, please try again.");
            sword(input,s);
        }
    }
    
    public void bow(Scanner input, Bow b){
           System.out.println("You currently have " + String.valueOf((int) (shootAcc*100)) + "% accuracy and " + String.valueOf(shootDam) + " damage on your shot.");
           System.out.println("You found a bow with " + String.valueOf((int)(b.getPercent()*100)) + "% accuracy and " + String.valueOf(b.getDamage()) + " shoot damage. Do you want to Take(t) it or No(n)?");
           String response = input.nextLine();
           response = response.toLowerCase();
           
           if(response.equals("take") || response.equals("t")){
                shootAcc = b.getPercent();
                shootDam = b.getDamage();
                System.out.println("You picked up the bow.");
                System.out.println("You now have " + String.valueOf((int) (shootAcc*100)) + "% accuracy and " + String.valueOf(shootDam) + " damage on your shot.");
            } else if(response.equals("no") || response.equals("n")){
                System.out.println("You didn't take the bow.");
            } else {
                bow(input, b);
            }
    }
    
    
     public void getItem(Scanner input){
         int random = (int)(Math.random()*2);
         
         if(random==0){
           Potion p = new Potion();
           potion(input, p);
         } else if (random==1){
           Sword s = new Sword();
           sword(input, s);
         } else if (random==2){
           Bow b = new Bow();
           bow(input, b);
         }
         
    
    }
}

   