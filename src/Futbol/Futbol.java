

package Futbol;

import becker.robots.*;
public class Futbol {
    private Robot joe;
    private City unal;
    private Thing balon;
    private int x;

    public Futbol (){
        this.unal =new City (10,10);
        this.balon= new Thing (this.unal,9,9);
        this.joe = new Robot  (unal,9,9,Direction.WEST);
    }
    
     public void advance(){
        this.joe.move ();
    }
    public void advanceLeft(){
        this.joe.turnLeft ();
        this.joe.move ();
      
    }
    public void advanceRight (){
        x=0;
        while (x<3){
            this.joe.turnLeft();
            x++;
        } 
        this.joe.move (); 
    }
    public void pickThing(){
        this.joe.pickThing();
        }
    public void putThing (){
        this.joe.putThing();
    
    }
 }