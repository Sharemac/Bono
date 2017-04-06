

package Recorrer;

import becker.robots.*;
public class Recorrer {
    private City ciudad =  new City (15,15);
    private Robot joe = new Robot (ciudad, 11,0, Direction.EAST);
    private Thing balon;
    private int [][] recoger=  new int [15][15];

    public void Recorrer (){
        int x=0;
        int a=0;
        int b = 0;
       while (x<13){
            if (this.joe.canPickThing()== true){
          this.joe.pickThing();
          this.joe.getAvenue();
          this.joe.getStreet();
          System.out.println(this.joe.getAvenue()+","+ this.joe.getStreet() +"\n");
          this.joe.move();
          x++;
            }
            if  (this.joe.canPickThing()==false){
                this.joe.move();
                x++;
            }
            }
       
            if (x==13){
          this.joe.pickThing();
          this.joe.getAvenue();
          this.joe.getStreet();
          System.out.println(this.joe.getAvenue()+","+ this.joe.getStreet() +"\n");
          this.joe.turnLeft();
            this.joe.turnLeft();            
           while (a<3){
           this.joe.move();
          a++;
       }
       }
       }
    

public void Dibujar(){
        for(int i =0; i<15; i++){
            Wall blockAve0 = new Wall(ciudad, 0, i, Direction.NORTH);
        }
        for(int i=0; i<12; i++){
        
            Wall blockAve0 = new Wall(ciudad, i, 0, Direction.WEST);
        }
        
        for(int i =0; i<15; i++){
           Wall blockAve0 = new Wall(ciudad,11, i, Direction.SOUTH);
        }
        
        for(int i=0; i<12; i++){
        
            Wall blockAve0 = new Wall(ciudad, i, 14, Direction.EAST);
        }
        
        for(int i=0; i<11; i++){
            Wall blockAve0 = new Wall(ciudad,i, 1, Direction.WEST);
        }
        
        for(int i=1; i<5; i++){
            Wall blockAve0 = new Wall(ciudad,i, 2, Direction.WEST);
        }
        Wall blockAve15 = new Wall(ciudad,6, 2, Direction.WEST);
        Wall blockAve2 = new Wall(ciudad,8, 2, Direction.WEST);
        Wall blockAve3 = new Wall(ciudad,9, 2, Direction.WEST);
        
        for(int i=1; i<5; i++){
            Wall blockAve0 = new Wall(ciudad,i, 3, Direction.WEST);
        }
        Wall blockAve4 = new Wall(ciudad,9, 3, Direction.WEST);
        Wall blockAve5 = new Wall(ciudad,3, 4, Direction.WEST);
        
        for(int i=1; i<12; i++){
            Wall blockAve0 = new Wall(ciudad,i, 14, Direction.WEST);
        }
        
        for(int i=1; i<=8; i++){
            Wall blockAve0 = new Wall(ciudad,i, 13, Direction.WEST);
        }
        
        
        Wall blockAve0 = new Wall(ciudad,4, 12, Direction.WEST);
        Wall blockAve6 = new Wall(ciudad,5, 12, Direction.WEST);
        Wall blockAve7 = new Wall(ciudad,6, 12, Direction.WEST);
        Wall blockAve8 = new Wall(ciudad,2, 12, Direction.WEST);
        Wall blockAve9 = new Wall(ciudad,10, 13, Direction.WEST);
        Wall blockAve10 = new Wall(ciudad,5, 11, Direction.WEST);
        Wall blockAve11 = new Wall(ciudad,8, 12, Direction.WEST);
        Thing parcel543 = new Thing(ciudad, 8, 11);
        Thing parcel2 = new Thing(ciudad, 0, 1);
      Thing parcel3 = new Thing(ciudad, 0, 5);
      Thing parcel4 = new Thing(ciudad, 0, 12);
      Thing parcel5 = new Thing(ciudad, 1, 6);
      Thing parcel6 = new Thing(ciudad, 1, 11);
      Thing parcel7 = new Thing(ciudad, 2, 3);
      Thing parcel8 = new Thing(ciudad, 2, 9);
      Thing parcel9 = new Thing(ciudad, 3, 7);
      Thing parcel10 = new Thing(ciudad, 3, 12);
      Thing parcel11 = new Thing(ciudad, 5, 1);
      Thing parcel12 = new Thing(ciudad, 5, 4);
      Thing parcel13 = new Thing(ciudad, 5, 10);
      Thing parcel14 = new Thing(ciudad, 6, 3);
      Thing parcel15 = new Thing(ciudad, 6, 11);
      Thing parcel16 = new Thing(ciudad, 7, 1);
      Thing parcel17 = new Thing(ciudad, 7, 8);
      Thing parcel18 = new Thing(ciudad, 8, 2);
      Thing parcel19 = new Thing(ciudad, 8, 5);
      Thing parcel20 = new Thing(ciudad, 9, 4);
      Thing parcel21 = new Thing(ciudad, 9, 8);
      Thing parcel22 = new Thing(ciudad, 9, 13);
      Thing parcel23 = new Thing(ciudad, 10, 1);
      Thing parcel24 = new Thing(ciudad, 10, 6);
      Thing parcel25 = new Thing(ciudad, 10, 12);
      Thing parcel26 = new Thing(ciudad, 11, 4);
      Thing parcel27 = new Thing(ciudad, 11, 13);
      
      for (int i = 0; i < 15; i++) {
           if(i!=10){
           Wall blockAve1 = new Wall(ciudad, 11,i, Direction.NORTH);
          }
       }
       for (int i = 0; i < 15; i++) {
           if(i!=3){
           Wall blockAve1 = new Wall(ciudad, 10,i, Direction.NORTH);
          }
   }
       for (int i = 0; i < 15; i++) {
           if(i!=9){
           Wall blockAve1 = new Wall(ciudad, 9,i, Direction.NORTH);
          }
       }
       for (int i = 0; i < 15; i++) {
           if(i!=6){
           Wall blockAve1 = new Wall(ciudad, 8,i, Direction.NORTH);
          }
       }
       for (int i = 0; i < 15; i++) {
           if(i!=4){
           Wall blockAve1 = new Wall(ciudad, 7,i, Direction.NORTH);
          }
       }
       for (int i = 0; i < 15; i++) {
           if(i!=5){
           Wall blockAve1 = new Wall(ciudad, 6,i, Direction.NORTH);
          }
       }
       for (int i = 0; i < 15; i++) {
           if(i!=10){
           Wall blockAve1 = new Wall(ciudad, 5,i, Direction.NORTH);
          }
       }
       for (int i = 0; i < 15; i++) {
           if(i!=7){
           Wall blockAve1 = new Wall(ciudad, 4,i, Direction.NORTH);
          }
       }
              for (int i = 0; i < 15; i++) {
                  if(i!=8){
           Wall blockAve1 = new Wall(ciudad, 3,i, Direction.NORTH);
          }
              }
       for (int i = 0; i < 15; i++) {
           if(i!=4){
           Wall blockAve1 = new Wall(ciudad, 2,i, Direction.NORTH);
          }
       }
       for (int i = 0; i < 15; i++) {
           if(i!=5){
           Wall blockAve1 = new Wall(ciudad, 1,i, Direction.NORTH);
          }
       }
    
    }
}
       
 
    
 