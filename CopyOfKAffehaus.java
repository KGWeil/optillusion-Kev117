
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse CopyOfKAffehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class CopyOfKAffehaus extends PApplet
{       
    int u=40;
    int[] abstand={10, 20, 30, 20, 10, 20, 30, 20, 10}; 
    
    
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    public void Kaffehaus()
    {

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
        stroke (0); 
        fill (0);
        zeichneQuadrate (); 
        stroke (187);
        parallelen ();

    }

    public void parallelen ()

    {
        for (int i=0;i<10;i++){

            line(10,u*i,630,u*i);
        }
    }

    public void zeichneQuadrate ()
    {for(int k=0; k<9; k++){ for (int s=0; s<9; s++) {
                square(10+2*u*s+abstand[k], k*u, u);
            }
        }
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
        PApplet.main(new String[] {CopyOfKAffehaus.class.getName() });
    }

}
