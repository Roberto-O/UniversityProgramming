//Bike class - Original code by Roberto Olivera
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Bike {
    private int over;
    private int down;
    private Color bikeColor;

    public Bike(int x, int y, Color c) {
        over = x;
        down = y;
        bikeColor = c;
    }// end bus constructor
    
    public void draw( Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1)); //reset line thickness

        g.setColor(Color.BLACK);
        g.fillOval(over,down,40,40); //black tire circle
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(over+5,down+5,30,30); //gray rim circle
        g.fillOval(over+20,down+10,10,10);
        g.setColor(Color.WHITE);
        g.fillOval(over+8,down+8,24,24); //white space circle
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(over+15,down+15,10,10); //middle wheel chain
        g.setColor(Color.GRAY);
        g.fillOval(over+17,down+17,6,6);  //middle wheel chain2

        g.setColor(Color.BLACK);
        g.drawLine(over+15,down+10,over+25,down+30);
        g.drawLine(over+20,down+9,over+20,down+31); //vertical line
        g.drawLine(over+25,down+9,over+15,down+31);
        g.drawLine(over+8,down+20,over+31,down+20); //horizontal line
        g.drawLine(over+10,down+27,over+30,down+14);
        g.drawLine(over+10,down+14,over+30,down+26);

        /****************************wheel 2********************************************/
        
        //make tire
        g.setColor(Color.BLACK);
        g.fillOval(over+68,down,40,40); //black tire circle
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(over+5+68,down+5,30,30); //gray rim circle
        g.fillOval(over+20+68,down+10,10,10);
        g.setColor(Color.WHITE);
        g.fillOval(over+8+68,down+8,24,24); //white space circle
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(over+15+68,down+15,10,10); //middle wheel chain
        g.setColor(Color.GRAY);
        g.fillOval(over+17+68,down+17,6,6);  //middle wheel chain2

        //tire rims
        g.setColor(Color.BLACK);
        g.drawLine(over+15+68,down+10,over+25+68,down+30);
        g.drawLine(over+20+68,down+9,over+20+68,down+31); //vertical line
        g.drawLine(over+25+68,down+9,over+15+68,down+31);
        g.drawLine(over+8+68,down+20,over+31+68,down+20); //horizontal line
        g.drawLine(over+10+68,down+27,over+30+68,down+14);
        g.drawLine(over+10+68,down+14,over+30+68,down+26);
        
        //create bike frame
        g2.setStroke(new BasicStroke(3));
        g2.setColor(bikeColor);
        g2.drawLine(over+20,down+20,over+47,down+25); //back bottom pole
        g2.drawLine(over+20,down+20,over+41,down+2); //back top pole
        g2.drawLine(over+47,down+25,over+40,down-5); //seat pole
        g2.drawLine(over+47,down+25,over+75,down-2); //bottom front pole
        g2.drawLine(over+88,down+20,over+70,down-15); //front wheel pole
        g2.drawLine(over+41,down+2,over+73,down-5); //top middle
        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(2));
        g2.setStroke(new BasicStroke(2f, BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
        g2.drawLine(over+40,down-5,over+39,down-11); //seat pole
        g2.drawLine(over+70,down-15,over+67,down-20); //handlebar pole
        g2.drawLine(over+67,down-20,over+71,down-22); //handlebar2 pole
        g2.drawLine(over+71,down-22,over+65,down-23); //handlebar3 pole
        g2.drawLine(over+47,down+25,over+49,down+33); //pedal bar
        g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.BLACK);
        g2.drawLine(over+35,down-11,over+43,down-11); //bike seat
        g2.drawLine(over+35,down-12,over+43,down-11); //bike seat2
        g2.drawLine(over+65,down-23,over+60,down-23); //handlebar grip
        g2.drawLine(over+47,down+33,over+51,down+33); //pedal
        g2.setStroke(new BasicStroke(1));
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(over+42,down+18,10,10); //chain wheel1
        g.setColor(Color.GRAY);
        g.fillOval(over+44,down+20,6,6);  //chain wheel2
        g.setColor(Color.WHITE);
        g.fillOval(over+46,down+22,2,2); //chain wheel3
    }
    
}
