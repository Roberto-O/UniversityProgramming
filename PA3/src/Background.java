//Background class - Original code by Roberto Olivera
import java.awt.*;

public class Background  {
    
    
    public Background(){
        
    }//end default constructor  
    
    public void draw(Graphics g){
      //grass  
      g.setColor(new Color(107, 196, 82));
      g.fillRect(0, 133, 600, 400);
      
      //sidewalk
      g.setColor(new Color(191,191,191));
      g.fillRect(0, 395, 600, 75);
      
      //sidewalk lines
      g.setColor(new Color(210,210,210));
      g.fillRect(598, 395, 2, 75);
      g.fillRect(1, 395, 2, 75);
      int j = 100;
      for(int i = 0; i<5; i++){
          g.fillRect(j, 395, 2, 75);
          j = j+100;
      }
      
      //road
      g.setColor(new Color(45,48,43));
      g.fillRect(0,160,600,178);
      
      //yellow stripes
      g.setColor(new Color(254,222,59));
      g.fillRect(50, 248, 28, 8);
      g.fillRect(0, 248, 2, 8);
      int a = 50;
      for(int in = 0; in<6; in++){
          g.fillRect(a, 248, 28, 8);
          a = a+100;
      }
      
    }//end draw

    
}//end class
