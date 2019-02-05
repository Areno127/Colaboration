/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createaliens;

/**
 *
 * @author sethd
 */
public class Alien {
    protected int eyes;
    protected int arms;
    protected int legs;
    public String description;
    
    public Alien(int e, int a, int l){
        eyes = e;
        arms = a;
        legs = l;
    }
    @Override
    public String toString(){
        System.out.println("This alien has " + eyes + " eyes, " + arms 
                + " arms and " + legs + " legs.");
        return description;
    }
    
}
