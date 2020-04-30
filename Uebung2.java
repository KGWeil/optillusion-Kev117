
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Uebung2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Uebung2 extends PApplet
{       
    int a=20; //Abstand der Balken zur y-Achse
    int abstand=35;//abstand der BAlken untereinander + Breite der Balken 
    int aabstand=2*abstand;//Abstand der linken Ecken eines BAlkens zur nächsten
    int aaabstand=3*abstand-abstand/4; //abstand der waagerechten Balken zueinadner
    int höhe=3*abstand + 3*aaabstand;//höhe des fensters
    int breite=7*aabstand +2*a; //Breite des fenster   
    int d=5; //Größe Schwarzweisse Quadrate

    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(breite,höhe);
    }        

    public void senkrechteBalken(){
        fill(0);
        for (int i=0; i<8; i++) 
        {
            rect(a+i*aabstand, 0, abstand,höhe);
        }
    }

    public void quadrate(int x,int y, boolean dunkelblau){
        if (dunkelblau==true) {fill(0,51,204);} else {fill(0,204,255);} 
        rect (x,y, abstand, abstand); 
        noStroke();

    }

    public void waagerechteBalken(){
        boolean dunkelblau=true; 
        for (int u=0; u<8; u++){
            for (int i=0; i<15; i++){
                quadrate(i*abstand, abstand+u*aaabstand, dunkelblau); 
                if (dunkelblau==true) {dunkelblau=false;} else {dunkelblau=true;} 

            }}
    }

    public void viereck (int x, int y, boolean obenweiß){
        noStroke();
        if (obenweiß==true) {fill(255);} else {fill(0);}
        for (int u=0; u<2; u++){
            quad(x,y+u*abstand,x+d, y-d+u*abstand, x, y-2*d+u*abstand, x-d, y-d+u*abstand); 
            if (obenweiß==true) {fill(0);} else {fill(255);}
        }

        for (int u=0; u<2; u++){
            quad(x,y+u*abstand,x+d, y-d+u*abstand, x+2*d, y+u*abstand, x+d, y+d+u*abstand);
            if (obenweiß==true) {fill(255);} else {fill(0);} 
        }
        
        for (int u=0; u<2; u++){
            quad(x,y+u*abstand,x+d, y+d+u*abstand, x, y+2*d+u*abstand, x-d, y+d+u*abstand);
            if (obenweiß==true) {fill(0);} else {fill(255);} 
        }
        
          for (int u=0; u<2; u++){
            quad(x,y+u*abstand,x-d, y-d+u*abstand, x-2*d, y+u*abstand, x-d, y+d+u*abstand);
            if (obenweiß==true) {fill(255);} else {fill(0);} 
        }
    }

    public void vierrauten(){
        boolean obenweiß=true;
        for (int i=0; i<15; i++){
        for (int u=0; u<15; u++){
        viereck(a+u*abstand, abstand+i*aaabstand, obenweiß);
        if (obenweiß==true) {obenweiß=false;} else {obenweiß=true;} }
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
        senkrechteBalken(); 
        waagerechteBalken();
        vierrauten();
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
        PApplet.main(new String[] {Uebung2.class.getName() });
    }

}
