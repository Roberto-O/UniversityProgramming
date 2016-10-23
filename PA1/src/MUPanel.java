        /**------------------------------------------*
         *     CSC 120 Project Assignment # 1       *
         *         Author: Roberto Olivera          *
         *         Date:   September 10, 2016       *
         *                                          *
         * A simple java program that will print    *
         * out 2 school buses and 2 bicycles.       *
         *                                          *
         * Enhancements: Custom colors,different    *
         * font sizes, rounded shapes, joined lines,*
         * custom font.                             *
         *-----------------------------------------**/
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class MUPanel extends JPanel {

    private Bus bus1,bus2;
    private Bike bike1,bike2;
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("PA1 Roberto Olivera 9/10/16");
        setUp();
        setBackground(Color.WHITE);

        bus1 = new Bus(70,150);
        bus2 = new Bus(400,300);
        bike1 = new Bike(180,320,Color.RED);
        bike2 = new Bike(450,210,new Color(164,54,186));
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!
        
        bus1.draw(g);
        bus2.draw(g);
        bike1.draw(g);
        bike2.draw(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("Roberto Olivera", 660,580);
    } // end of paintComponent()

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
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
