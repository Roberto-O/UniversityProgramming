/*
    CSC 120
    Programming Assignment 2
    Roberto Olivera
    September 19, 2016
    A simple Java Program that shows various information about CS Professors like how many classes they are teaching this year and how many minutes and hours that is equal to.
*/

import java.awt.*;
import java.text.*;
import javax.swing.*;

public class MUPanel extends JPanel  {
    
    private Professors Cindric, Kirchmeyer, Klayder, Weber, Smith;
    private MUTextArea muta;
    private DecimalFormat f = new DecimalFormat("##.00");


    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("CSC 120 PA 2 - CS MU Professors");
        setBackground(Color.WHITE); 
        muta = new MUTextArea();
        muta.setBounds(10, 10, 780, 580);
        add(muta);

        Cindric = new Professors("Cindric", 6, true, 2, true, 2, true, 2, false, 0, false, 0, false ,0, false, 0);
        Kirchmeyer = new Professors("Kirchmeyer", 0, false, 0, false, 0, false, 0, false, 0, false, 0, false, 0, false ,0);
        Klayder = new Professors("Klayder", 6, true, 3, false, 0, true, 3, false, 0, false , 0, true, 3, false, 0);
        Weber =  new Professors("Weber", 8, true, 7, false, 0, true, 1, false , 0, true, 4, false, 0, false, 0);
        Smith = new Professors("Smith", 1, false, 0, false, 0, false, 0, true, 1, false, 0, false, 0, true, 1);

        muta.println(Cindric.toString());
        workWithCindric();
        muta.println(Kirchmeyer.toString());
        workWithKirchmeyer();
        muta.println(Klayder.toString());
        workWithKlayder();
        muta.println(Weber.toString());
        workWithWeber();
        muta.println(Smith.toString());
        workWithSmith();

        muta.println("*Professor information was obtained from Self Service*");
    } // end of MUPanel constructor

    private void workWithCindric(){
        int numMWF = 48;
        int numMW = 32;
        int numTR = 32;
        int minsMWF = 65;
        int minsTR = 100;
        int temp1,temp2,temp3;
        int totalMins;
        double totalHours;

        if(Cindric.getClassesT() == 0){
            muta.println("Professor " + Cindric.getName() + " doesn't teach any classes this school year.\n");
        }else{
            temp1 = (numMWF * Cindric.getCtMWF()) * minsMWF;
            temp2 = (numMW * Cindric.getCtMW()) * minsMWF;
            temp3 = (numTR * Cindric.getCtTR()) * minsTR;
            totalMins = temp1 + temp2 + temp3;
            totalHours = (double) totalMins / 60;
            muta.println("Professor " + Cindric.getName() + " teaches a total of " + totalMins + " minutes which is equal to " + f.format(totalHours) + " hours.\n");
            
        }
    }

    private void workWithKirchmeyer(){

        if(Kirchmeyer.getClassesT() == 0){
            muta.println("Professor " + Kirchmeyer.getName() + " doesn't teach any classes this school year.\n");
        }else{
            muta.println("Uh oh if you're seeing this you must've messed with my code!");
        }
    }

    private void workWithKlayder(){
        int numMWF = 48;
        int numHalfTR = 16;
        int minsMWF = 65;
        int minsTR = 100;
        int temp1,temp2;
        int totalMins;
        double totalHours;

        if(Klayder.getClassesT() == 0){
            muta.println("Professor " + Klayder.getName() + " doesn't teach any classes this school year.\n");
        }else{
            temp1 = (numMWF * Klayder.getCtMWF()) * minsMWF;
            temp2 = (numHalfTR * Klayder.getCtTR()) * minsTR;
            totalMins = temp1 + temp2;
            totalHours = (double) totalMins / 60;
            muta.println("Professor " + Klayder.getName() + " teaches a total of " + totalMins + " minutes which is equal to " + f.format(totalHours) + " hours.\n");
        }
    }

    private void workWithWeber(){
        int numMWF = 48;
        int numTR = 32;
        int numHalfMWF = 24;
        int minsMWF = 65;
        int minsTR = 100;
        int temp1,temp2,temp3,temp4;
        int totalMins;
        double totalHours;

        if(Weber.getClassesT() == 0){
            muta.println("Professor " + Weber.getName() + " doesn't teach any classes this school year.\n");
        }else{
            temp1 = Weber.getCtMWF() - Weber.getHsMWF();
            temp2 = (numMWF * temp1) * minsMWF;
            temp3 = (numHalfMWF * Weber.getHsMWF()) * minsMWF;
            temp4 = (numTR * Weber.getCtTR()) * minsTR;
            totalMins = temp2 + temp3 + temp4;
            totalHours = (double) totalMins / 60;
            muta.println("Professor " + Weber.getName() + " teaches a total of " + totalMins + " minutes which is equal to " + f.format(totalHours) + " hours.\n");
        }
    }

    private void workWithSmith(){
        int numHalfR = 8;
        int minsTR = 100;
        int temp1;
        int totalMins;
        double totalHours;

        if(Smith.getClassesT() == 0){
            muta.println("Professor " + Smith.getName() + " doesn't teach any classes this school year.\n");
        }else{
            temp1 = (numHalfR * Smith.getHsR()) * minsTR;
            totalMins = temp1;
            totalHours = (double) totalMins / 60;
            muta.println("Professor " + Smith.getName() + " teaches a total of " + totalMins + " minutes which is equal to " + f.format(totalHours) + " hours.\n");
        }
    }



    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);   
        
    } // end of frame()

    public static void main(String args[]){new MUPanel().frame();}

}