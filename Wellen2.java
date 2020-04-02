
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2 extends PApplet
{       
    int s=55; //seitenlänge große Quadrate
    int h=25; //abstand zu den Achsen 
    int a=s/11; //Größe der Spalte
    int c=s-2*a; //Seitenlänge kleine Quadrate 
    int z=c+2*a; //Abstand der kleinen Quadrate

    
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(700,700);
    }        

    public void großequadrate(int x, int y,boolean farbe) {

        if (farbe==true) {fill(050,205,050);} else {fill(255);}

        rect(x, y, s, s); 

    }
    public void zeichnegroßequadrate() {
        boolean grün=true;
        noStroke ();
        for (int o=0; o<12; o++) {
            for (int i=0; i<12; i++) {

                großequadrate(h +s*i, h+s*o, grün);      

                if (grün==true) {grün=false;} else {grün=true;}

            }
            if (grün==false) {grün=true;} else {grün=false;}
        }
    }

    public void kleinequadrate(int x,int y, boolean farbe) {
        
        if (farbe==true) {fill(255);} else {fill(050,205,050);} 
        
        rect (x, y, c, c); 
        
    }

    public void zeichnekleinequadrate(){
        boolean weiß=true;
        
        for (int i=0; i<12; i++) {
        for (int k=0; k<12; k++) {
            kleinequadrate(h+a+k*z, h+a+i*z, weiß); 
            
            if (weiß==true) {weiß=false;} else {weiß=true;} 
        } if (weiß==true) {weiß=false;} else {weiß=true;}
    } 
    }
    
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255); 
        zeichnegroßequadrate();
        zeichnekleinequadrate(); 

    }


    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen2.class.getName() });
    }

}
