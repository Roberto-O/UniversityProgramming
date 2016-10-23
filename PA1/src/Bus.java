//Bus class - Original code by Roberto Olivera
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class Bus {
    int over;
    int down;

    public Bus(int x, int y) {
        over = x;
        down = y;
    }// end bus constructor

    public void draw( Graphics g ) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1)); //reset line thickness

        //school bus shape
        g.setColor( new Color( 255, 216, 0 ) ); //school bus yellow
        RoundRectangle2D rRect2 = new RoundRectangle2D.Float(over, down, 135, 70, 15, 15);
        g2.fill(rRect2);
        RoundRectangle2D rRect3 = new  RoundRectangle2D.Float(over+105, down+30, 67, 40, 10, 10);
        g2.fill(rRect3);

        //headlight
        g.setColor(new Color(121,121,112));
        RoundRectangle2D headlight = new  RoundRectangle2D.Float(over+163, down+30, 9, 9, 7, 7);
        g2.draw(headlight);
        g.setColor(new Color(255,255,212));
        RoundRectangle2D headlight2 = new  RoundRectangle2D.Float(over+163, down+31, 8, 8, 7, 7);
        g2.fill(headlight2);

        //holes for wheels
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(over+130, down+53, 35, 35, 0, 180);
        g.fillArc(over+10, down+53, 35, 35, 0, 180);

        //wheels
        g.setColor(Color.BLACK);
        g.fillOval(over+12, down+54, 31, 31);
        g.fillOval(over+132,down+54,31,31);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(over+20, down+62,15,15);
        g.fillOval(over+140, down+62,15,15);

        //windows
        g.setColor(Color.BLACK);
        RoundRectangle2D rRect5 = new  RoundRectangle2D.Float(over+8, down+17, 17, 17, 2, 2);
        RoundRectangle2D rRect6 = new  RoundRectangle2D.Float(over+31, down+17, 17, 17, 2, 2);
        RoundRectangle2D rRect7 = new  RoundRectangle2D.Float(over+54, down+17, 17, 17, 2, 2);
        RoundRectangle2D rRect8 = new  RoundRectangle2D.Float(over+77, down+17, 17, 17, 2, 2);
        g2.draw(rRect5); g2.draw(rRect6); g2.draw(rRect7); g2.draw(rRect8);
        g.setColor(new Color(136,197,250));
        RoundRectangle2D wind1 = new  RoundRectangle2D.Float(over+9, down+18,16,16, 2, 2);
        RoundRectangle2D wind2 = new  RoundRectangle2D.Float(over+32, down+18,16,16, 2, 2);
        RoundRectangle2D wind3 = new  RoundRectangle2D.Float(over+55, down+18,16,16, 2, 2);
        RoundRectangle2D wind4 = new  RoundRectangle2D.Float(over+78, down+18,16,16, 2, 2);
        g2.fill(wind1); g2.fill(wind2); g2.fill(wind3); g2.fill(wind4);

        //door
        g.setColor(Color.BLACK);
        RoundRectangle2D door = new  RoundRectangle2D.Float(over+105, down+26, 20, 43, 4, 4);
        g2.draw(door);
        g.setColor(new Color(136,197,250));
        g.fillRect(over+108, down+29,5,21);
        g.fillRect(over+118, down+29,5,21);
        g.setColor(Color.BLACK);
        g.drawLine(over+115, down+26, over+115, down+69);
        g.drawLine(over+105, down+51, over+125, down+51);
        g.drawLine(over+135, down+9, over+135, down+30);
        g.drawLine(over+171, down+43, over+171, down+61);
        g.drawLine(over+169, down+43, over+169, down+61);

        //draw bus grill
        int a = down+43;
        do{
            g.drawLine(over+169, a, over+171, a);
            a = a+2;
        }while(a <= down+61);

        //lines
        thick2(g);
        thick3(g);

        //School bus text
        Font currentFont = g.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * .8F); //make font smaller
        g.setFont(newFont);
        g.drawString("School Bus",over+25, down+49);
        newFont = currentFont.deriveFont(currentFont.getSize() * 1F);
        g.setFont(newFont); //reset font size
    }// end of draw()

    private void thick2(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(2)); //change line thickness
        g.drawLine(over+4, down+51, over+100, down+51);
        g.drawLine(over+4, down+40, over+100, down+40);
        g.setColor(new Color(136,197,250)); //windshield color
        g.drawLine(over+134, down+10, over+134, down+30); //windshield line
        g.setColor(Color.BLACK); //top bus line
    }//end thick2

    private void thick3(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(3)); //change line thickness
        g.drawLine(over+7, down+8, over+128, down+8);
    }//end thick3

} // end of class ThingTwo