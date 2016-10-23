        /**------------------------------------------*
         *     CSC 120 Project Assignment # 3       *
         *         Author: Roberto Olivera          *
         *         Date:   October 15, 2016         *
         *                                          *
         * A simple java program that will print    *
         * out a bike and bicycle which you can move*
         * around as well as change time and change *
         * from a sun to a moon and night and day   *
         *                                          *
         *                                          *
         *-----------------------------------------**/


import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    private Bus bus1 = new Bus(200,230);
    private Bike bike1 = new Bike(15,413,new Color(164,54,186));
    private Background scenery = new Background();
    private SunMoon sky = new SunMoon();
    
    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 500));
        setName("CSC 120 PA 3 - City");
        setUp();
        setBackground(new Color(135, 206, 235));
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!
        sky.draw(g);
        scenery.draw(g);
        bus1.draw(g);
        bike1.draw(g);
    } // end of paintComponent()
    
    
    public Color Day(Color c){
        this.setBackground(c);
        return c;
    }//end Day
    
    public Color Night(Color c){
        this.setBackground(c);
        return c;
    }//end Night
    
    public void moveBusForward(){
        bus1.moveForwad();
    }//end moveBusForward
    
    public void moveBusBackward(){
        bus1.moveBackward();
    }//end moveBusBackward
    
    public void moveBikeForward(){
        bike1.moveFront();
    }//end moveBikeForward
    
    public void moveBikeBackward(){
        bike1.moveBack();
    }//end moveBikeBackward
    
    public void addHours(){
        sky.addHour();
    }
    
    public void minusHours(){
        sky.minusHour();
    }
    
    public void moonColors(){
        sky.moonColor();
    }
    
    public void sunColors(){
        sky.sunColor();
    }
    

    
   
    
    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(false);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel

/*
case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
*/