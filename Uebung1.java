
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Uebung1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Uebung1 extends PApplet
{       
    int a=40;
    int s=30;
    int q=2*s;
    int g=17;
    int u=a+g;
    int k=0;
    int l=-6;
    boolean grün=true;
    boolean blau=false;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,455
        );
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {

    }

    public void viereck(int x, int y,int h, boolean grün) {

        quad(x, y , s+x, h+y, s+x, h+y+a, x, y+a);
        if (grün==true) {fill(0,153,102);} else {fill(0,51,153);}; 
        noStroke(); 
    }

    public void zeichneblaue(){

        for (int z=0; z<8; z++) {
            for (int i=0; i<13; i++){
                viereck(l*s+i*q+z*s,k+z*u,g,blau);

            }
       

        } 
        
    }

    public void zeichnegrüne(){
        for (int z=0; z<8; z++) {
            for (int i=0; i<14; i++){
                viereck(-7*s+i*q+z*s, g+z*u, -g, grün); 
                if (grün==true) {fill(0,153,102);};

                fill(0,153,102);

            }}
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
        background(150);
        zeichneblaue();
        zeichnegrüne();

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Uebung1.class.getName() });
    }

}
