//SunMoon class - Original code by Roberto Olivera (This draws the Sun)
import java.awt.*;

public class SunMoon {
    
    private final int WIDTH = 50;
    private final int HEIGHT = 50;
    private int over = 255;
    private int down = 3;
    private Color theColor = new Color(252,212,64);
    private Color c1 = new Color(252,212,64);
    private Color c2 = new Color(254,252,215);
    private int count = 1;
    
    public SunMoon(){
       
    }
    
    public void draw(Graphics g){
        g.setColor(theColor);
        g.fillOval(over, down, WIDTH, HEIGHT); //noon

    }
    
    public void addHour(){
        switch(over){
            case 10: //sunrise
                over+=30;
                down-=29;
                break;
            case 40: //7
                over+=27;
                down-=19;
                break;
            case 67: //8
                over+=47;
                down-=19;
                break;
            case 114: //9
                over+=47;
                down-=18;
                break;
            case 161: //10
                over+=47;
                down-=13;
                break;
            case 208: //11
                over+=47;
                down-=9;
                break;
            case 255: //noon
                over+=47;
                down+=9;
                break;
            case 302: //1
                over+=49;
                down+=13;
                break;
            case 351: //2
                over+=49;
                down+=18;
                break;
            case 400: //3
                over+=48;
                down+=19;
                break;
            case 448: //4
                if(theColor.equals(c2)){
                    count++;
                    theColor = c1;
                    over=10;
                    down=110;
                }else{
                    over+=48;
                    down+=19;
                }
                break;
            case 496: //5
                over+=44;
                down+=29;
                break;
            case 540: //sunset
                moonColor();
                over=10;
                down=110;
                count++;
                switch(count){
                    case 3:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                    case 13:
                        sunColor();
                        break;
                }
                break;
        }//end switch case
    }//end addHour method
    
    public void minusHour(){
        switch(over){
            case 10: //6 //sunrise
                moonColor();
                over=540;
                down=110;
                break;
            case 40: //7
                over-=30;
                down+=29;
                break;
            case 67: //8
                if(theColor.equals(c2)){
                    theColor = c1;
                    over=540;
                    down=110;
                }else{
                    over-=27;
                    down+=19;
                }
                break;
            case 114: //9
                over-=47;
                down+=19;
                break;
            case 161: //10
                over-=47;
                down+=18;
                break;
            case 208: //11 
                over-=47;
                down+=13;
                break;
            case 255: //noon 255,3
                over-=47;
                down+=9;
                break;
            case 302: //1
                over-=47;
                down-=9;
                break;
            case 351: //2
                over-=49;
                down-=13;
                break;
            case 400: //3
                over-=49;
                down-=18;
                break;
            case 448: //4
                over-=48;
                down-=19;
                break;
            case 496: //5
                over-=48;
                down-=19;
                break;
            case 540: //sunset
                over-=44;
                down-=29;
                break;
        }//end switch case
    }//end addHour method
    
    
    public void moonColor(){
        theColor = new Color(254, 252, 215);
    }
    
    public void sunColor(){
        theColor = new Color(252,212,64);
    }
    
    
    
    
    
    
    
}//end class SunMoon
