//CSC 120 PA2 Roberto Olivera 9/20/2016 Professors Class

public class Professors {
    private String name;
    private boolean MWF, MW, TR, R, halfMWF, halfTR, halfR;
    private int classesTaught, ctMWF, ctMW, ctTR, ctR, hsMWF, hsTR, hsR;

    public Professors(String n, int cT, boolean monwenfri, int aMWF, boolean monwen, int aMW, boolean tuesthurs, int aTR,  boolean thurs, int aR, boolean haMWF, int halMWF, boolean haTR, int halTR, boolean haR, int halR){
        name = n;
        classesTaught = cT;
        MWF = monwenfri;
        ctMWF = aMWF;
        MW = monwen;
        ctMW = aMW;
        TR = tuesthurs;
        ctTR = aTR;
        R = thurs;
        ctR = aR;
        halfMWF = haMWF;
        hsMWF = halMWF;
        halfTR = haTR;
        hsTR = halTR;
        halfR = haR;
        hsR = halR;
    }//end constructor

    public String getName(){
        return name;
    }//end getName
    public void setName(String na){
        name = na;
    }//end setName

    public int getClassesT(){
        return classesTaught;
    }//end getClass
    public void setClassesT(int ct){
            classesTaught = ct;
    }//end setClassT

    public boolean getMWF(){
        return MWF;
    }//end getMWF
    public void setMWF(Boolean x){
        MWF = x;
    }//end setMWF

    public boolean getMW(){
        return MW;
    }//end getMW
    public void setMW(Boolean x){
        MW = x;
    }//end setMW

    public boolean getTR(){
        return TR;
    }//end getTR
    public void setTR(Boolean x){
        TR = x;
    }// end setTR

    public boolean getR(){
        return R;
    }// end getR
    public void setR(Boolean x){
        R = x;
    }//end setR

    public int getCtMWF(){
        return ctMWF;
    }// end getCtMWF
    public void setCtMWF(int a){
        ctMWF = a;
    }//end setCtMWF

    public int getCtMW(){
        return ctMW;
    }//end getCtMW
    public void setCtMW(int a){
        ctMW = a;
    }//end setCtMW

    public int getCtTR(){
        return ctTR;
    }//end getCtTR
    public void setCtTR(int a){
        ctTR = a;
    }//end setCtTR

    public int getCtR(){
        return ctR;
    }//end getCtR
    public void setCtR(int a){
        ctR = a;
    }//end setCtR

    public boolean getHalfMWF(){
        return halfMWF;
    }//end getHalfMWF
    public void setHalfMWF(boolean x){
        halfMWF = x;
    }// end setHalfMWF

    public int getHsMWF(){
        return hsMWF;
    }//end getHsMWF
    public void setHsMWF(int a){
        hsMWF = a;
    }//end setHsMWF

    public boolean getHalfTR(){
        return halfTR;
    }//end getHalfTR
    public void setHalfTR(boolean x){
        halfTR = x;
    }// end setHalfTR

    public int getHsTR(){
        return hsTR;
    }//end getHsTR
    public void setHsTR(int a){
        hsTR = a;
    }//end setHsTR

    public boolean getHalfR(){
        return halfR;
    }//end getHalfR
    public void setHalfR(boolean x){
        halfR = x;
    }// end setHalfR

    public int getHsR(){
        return hsR;
    }//end getHsR
    public void setHsR(int a){
        hsR = a;
    }//end setHsR

    public String toString(){
        return "Professor " + name + " teaches " + classesTaught + " total CS classes this 2016-17 school year.\n" +"Does he teach on...\n" + "MWF: " + MWF + ". If so, how many? " + ctMWF + "\nMW: " + MW + ". If so, how many? " + ctMW
                + "\nTR: " + TR + ". If so how many? " + ctTR + "\nR: " + R + ". If so, how many? " + ctR + "\nWhere any of those classes taught for only half a semester?\n" + "MWF: " + halfMWF + ". " + hsMWF +
                " of those classes were half semester\n" + "TR: " + halfTR + ". " + hsTR + " of those classes were half semester.\n" + "R: " + halfR + ". " + hsR + " of those classes were half semester.";
    }//end toString


}// end class
