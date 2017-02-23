

package Laberitno;
import becker.robots.*;


public class laberinto {
    private Robot Cami;
    private City unal;
    private Thing balon;
    
    public laberinto (){
    int a=1;
    int b=1;
    int c=1;
    int d=1;
    int e=1;
    
      this.unal =new City (10,12);
       while (b<10){
       Wall block = new Wall(unal, 1,b , Direction.NORTH);
       b++;
       }
       
       while (a<6){
       Wall block1 = new Wall(unal, a,1 , Direction.WEST);
       a++;
       }
        while (c<6){
       Wall block1 = new Wall(unal, c,4 , Direction.WEST);
       c++;
       }
        while (d<6){
       Wall block1 = new Wall(unal, d,9 , Direction.EAST);
       d++;
       }
        while (e<6){
       Wall block1 = new Wall(unal, e,7 , Direction.WEST);
       e++;
}
         Wall block1 = new Wall(unal, e,7 , Direction.WEST);
    }
    }
