
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Uebung3.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Uebung3 extends PApplet
{       
    int s=20; //Seitenlänge der Quadrate 
    int e=1; //Größe des Randes 
    int sk=s/4; //größe kleine Quadrate 
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(24*s,24*s);
    }        

    public void außenquadrate(int x, int y, boolean schwarz){

        noStroke();
        if (schwarz==true) {fill(0);} else {fill(255);}
        rect(x, y, s, s);
        if (schwarz==true) {fill(255);} else {fill(0);}
        rect (x+e, y+e, sk, sk);     
        rect (x+s-sk-e, y+s-sk-e, sk, sk); 

    }

    public void zeichnequadrateaußen(){
        boolean schwarz=true;
        for (int o=0; o<24; o++){
            for (int i=0; i<24; i++){
                außenquadrate(0+s*i,0+s*o,schwarz);
                if (schwarz==true) {schwarz=false;} else {schwarz=true;}
            }
            if (schwarz==true) {schwarz=false;} else {schwarz=true;}
        }
    }

    public void mittenquadrate(int x, int y, boolean schwarz){     
        if (schwarz==true) {fill(0);} else {fill(255);}   
        rect (x, y, s, s); 
        
    }

    public void zeichnemittenquadrate(){
        noStroke();
        boolean schwarz=true;        
        for (int i=0; i<12; i++){ 
            for (int u=0; u<12; u++){  
                mittenquadrate(6*s+u*s, 6*s+s*i,schwarz); 
                if (schwarz==true) {schwarz=false;} else {schwarz=true;}
            }
            if (schwarz==true) {schwarz=false;} else {schwarz=true;}
        }
    }

    public void innereQuadrate(int x, int y, boolean schwarz){
        noStroke();
        if (schwarz==true) {fill(0);} else {fill(255);}
        rect(x, y, s, s);
        if (schwarz==true) {fill(255);} else {fill(0);}
        rect (x+s-sk-e, y+e, sk, sk);     
        rect (x+e, y+s-sk-e, sk, sk); 
        
    }
    
    public void zeichneinnereQuadrate(){
         boolean schwarz=true;
        for (int o=0; o<10; o++){
            for (int i=0; i<10; i++){
                innereQuadrate(7*s+s*i,7*s+s*o,schwarz);
                if (schwarz==true) {schwarz=false;} else {schwarz=true;}
            }
            if (schwarz==true) {schwarz=false;} else {schwarz=true;}
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
        zeichnequadrateaußen();
        zeichnemittenquadrate();
        zeichneinnereQuadrate();

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
        PApplet.main(new String[] {Uebung3.class.getName() });
    }

}
