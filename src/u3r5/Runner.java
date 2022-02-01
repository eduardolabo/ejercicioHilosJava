/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3r5;

/**
 *
 * @author Eduardo
 */
public class Runner {
    
    String name;
    int speed;
    

    public Runner(String name) {
        this.name = name;
        speed=(int) Math.random()*30;
    }
    
    public String toString(){
        return(name);
    }
    
    public String getName(){
        return(name);
    }
    
    public int getSpeed(){
        return(speed);
    }
    
    
}
